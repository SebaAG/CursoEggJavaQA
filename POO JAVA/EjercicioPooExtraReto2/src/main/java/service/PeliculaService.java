package service;

import entidad.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class PeliculaService {
    private final Pelicula[] peliculas;
    private int filmCont;

    /**
     * Constructor de la clase PeliculaService.
     * Crea una instancia de PeliculaService con el tamaño máximo especificado para el arreglo de películas.
     * Inicializa el arreglo de películas y establece el contador de películas en 0.
     * @param peliMax Tamaño máximo del arreglo de películas.
     */
    public PeliculaService(int peliMax) {
        peliculas = new Pelicula[peliMax];
        filmCont = 0;
    }

    /**
     * Crea una nueva película y la agrega al arreglo de películas.
     * Se verifica si el límite máximo de películas fue alcanzado.
     * Si el límite se ha alcanzado, se muestra un mensaje de error.
     *
     * @param titulo    El título de la película.
     * @param genero    El género de la película.
     * @param anio      El año de lanzamiento de la película.
     * @param duracion  La duración en minutos de la película.
     */
    public void crearPelicula(String titulo, String genero, int anio, int duracion) {
        if (filmCont < 5) {
        Pelicula peli1 = new Pelicula(titulo, genero, anio, duracion);
        peliculas[filmCont++] = peli1;
        } else {
            System.out.println("Máximo de películas permitidas!");
        }
    }
    /**
     * Muestra en consola la lista de películas registradas.
     * Si no hay películas registradas, se muestra un mensaje indicando esa situación.
     */
    public void listarPeliculas() {
        System.out.println("*****Películas*****");
        if (filmCont == 0) {
            System.out.println("No hay películas registradas.");
        } else {
            for (int i = 0; i < filmCont; ++i) {
                System.out.println(peliculas[i]);
            }
        }
    }
    /**
     * Busca una película por su título.
     *
     * @param titulo    El título de la película a buscar.
     * @return          La película encontrada, o null si no se encontró ninguna película con ese título.
     */
    public Pelicula buscarTitulo(String titulo) {
        for(int i = 0; i < filmCont; ++i) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return peliculas[i];
            }
        }
        return null;
    }
    /**
     * Busca todas las películas que pertenecen a un género específico.
     * Se utiliza una lista temporal (peliculasEncontradas) para almacenar las películas encontradas
     * del género especificado. Luego, se convierte esta lista en un arreglo usando el método toArray(new Pelicula[0]).
     *
     * @param genero    El género de las películas a buscar.
     * @return          Un nuevo arreglo de películas que pertenecen al género especificado.
     */
    public Pelicula[] buscarGenero(String genero) {
        List<Pelicula> peliculasEncontradas = new ArrayList<>();
        for (int i = 0; i < filmCont; ++i) {
            if (peliculas[i].getGenero().equalsIgnoreCase(genero)) {
                peliculasEncontradas.add(peliculas[i]);
            }
        }
        return peliculasEncontradas.toArray(new Pelicula[0]);
    }
}