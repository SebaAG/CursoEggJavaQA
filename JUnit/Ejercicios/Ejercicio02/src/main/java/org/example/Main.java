package org.example;

public class Main {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 98.6;
        double kelvin = 300.0;

        double celsiusToFahrenheitResult = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " ºC equivalen a " + celsiusToFahrenheitResult + " ºF");

        double fahrenheitToCelsiusResult = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " ºF equivalen a " + fahrenheitToCelsiusResult + " ºC");

        double celsiusToKelvinResult = TemperatureConverter.celsiusToKelvin(celsius);
        System.out.println(celsius + " ºC equivalen a " + celsiusToKelvinResult + " ºK");

        double kelvinToCelsiusResult = TemperatureConverter.kelvinToCelsius(kelvin);
        System.out.println(kelvin + " ºK equivalen a " + kelvinToCelsiusResult + " ºC");

        double fahrenheitToKelvinResult = TemperatureConverter.fahrenheitToKelvin(fahrenheit);
        System.out.println(fahrenheit + " ºF equivalen a " + fahrenheitToKelvinResult + " ºK");

        double kelvinToFahrenheitResult = TemperatureConverter.kelvinToFahrenheit(kelvin);
        System.out.println(kelvin + " ºK equivalen a " + kelvinToFahrenheitResult + " ºF");
    }
}