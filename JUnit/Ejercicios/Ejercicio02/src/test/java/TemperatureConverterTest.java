import org.example.TemperatureConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheitConversion() {
        double celsius = 25.0;
        double expectedFahrenheit = 77.0;

        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.1);
    }

    @Test
    public void testFahrenheitToCelsiusConversion() {
        double fahrenheit = 98.6;
        double expectedCelsius = 37.0;

        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(expectedCelsius, actualCelsius, 0.1);
    }

    @Test
    public void testCelsiusToKelvinConversion() {
        double celsius = 0.0;
        double expectedKelvin = 273.15;

        double actualKelvin = TemperatureConverter.celsiusToKelvin(celsius);

        assertEquals(expectedKelvin, actualKelvin, 0.1);
    }

    @Test
    public void testKelvinToCelsiusConversion() {
        double kelvin = 300.0;
        double expectedCelsius = 26.85;

        double actualCelsius = TemperatureConverter.kelvinToCelsius(kelvin);

        assertEquals(expectedCelsius, actualCelsius, 0.1);
    }

    @Test
    public void testFahrenheitToKelvinConversion() {
        double fahrenheit = 68.0;
        double expectedKelvin = 293.15;

        double actualKelvin = TemperatureConverter.fahrenheitToKelvin(fahrenheit);

        assertEquals(expectedKelvin, actualKelvin, 0.1);
    }

    @Test
    public void testKelvinToFahrenheitConversion() {
        double kelvin = 300.0;
        double expectedFahrenheit = 80.33;

        double actualFahrenheit = TemperatureConverter.kelvinToFahrenheit(kelvin);

        assertEquals(expectedFahrenheit, actualFahrenheit, 0.1);
    }
}
