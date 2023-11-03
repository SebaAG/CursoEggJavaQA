import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.POJO.People;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwapiTest {
    private static Response peopleResponse;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://swapi.dev/api/";

        Response response = given()
                .when()
                .get("people/2");

        peopleResponse = response;
    }

    @Test
    public void testPeopleEndpoint() {
        assertEquals(200, peopleResponse.getStatusCode());

        People people = peopleResponse.as(People.class);

        assertEquals("gold", people.getSkin_color());
        assertEquals(6, people.getFilms().size());
    }

    @Test
    public void testSecondMovieEndpoint() {
        Response movieResponse = given()
                .when()
                .get(peopleResponse.jsonPath().getString("films[1]"));
        assertEquals(200, movieResponse.getStatusCode());

        String releaseDate = movieResponse.jsonPath().getString("release_date");
        assertTrue(validateDateFormat(releaseDate));

        assertTrue(movieResponse.jsonPath().getList("characters").size() > 1);
        assertTrue(movieResponse.jsonPath().getList("planets").size() > 1);
        assertTrue(movieResponse.jsonPath().getList("starships").size() > 1);
        assertTrue(movieResponse.jsonPath().getList("vehicles").size() > 1);
        assertTrue(movieResponse.jsonPath().getList("species").size() > 1);

    }

    @Test
    public void testFirstPlanetEndpoint() {
        String lastFilmUrl = peopleResponse.jsonPath().getString("films[-1]");

        Response filmResponse = given()
                .when()
                .get(lastFilmUrl);
        assertEquals(200, filmResponse.getStatusCode());

        String firstPlanetUrl = filmResponse.jsonPath().getString("planets[0]");

        Response planetResponse = given()
                .when()
                .get(firstPlanetUrl);
        assertEquals(200, planetResponse.getStatusCode());

        String gravity = planetResponse.jsonPath().getString("gravity");
        String terrain = planetResponse.jsonPath().getString("terrain");

        String expectedGravity = "1 standard";
        String expectedTerrain = "desert";

        assertEquals(expectedGravity, gravity);
        assertEquals(expectedTerrain, terrain);
    }

    @Test
    public void testPlanetUrlEndpoint() {
        String lastFilmUrl = peopleResponse.jsonPath().getString("films[-1]");

        Response filmResponse = given()
                .when()
                .get(lastFilmUrl);
        assertEquals(200, filmResponse.getStatusCode());

        String firstPlanetUrl = filmResponse.jsonPath().getString("planets[0]");

        Response planetResponse = given()
                .when()
                .get(firstPlanetUrl);
        assertEquals(200, planetResponse.getStatusCode());

        String planetUrl = planetResponse.jsonPath().getString("url");

        assertEquals(firstPlanetUrl, planetUrl);
    }

    @Test
    public void testFilm7NotFound() {
        Response film7Response = given()
                .when()
                .get("films/7/");
        assertEquals(404, film7Response.getStatusCode());
    }

    private boolean validateDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
