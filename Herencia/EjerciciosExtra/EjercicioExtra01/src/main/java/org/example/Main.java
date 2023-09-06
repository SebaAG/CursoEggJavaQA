package org.example;

import org.example.entity.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Se crea la instancia de los barcos a utilizar
        Barco velero = new Velero("Velero007", 10.0, 2022, 2);
        Barco motorBarco = new MotorBarco("Motor001", 12.0, 2012, 250);
        Barco yate = new Yate("Yatesin007", 15.0, 2023, 400, 4);

        // Se crea la instancia del alquiler con LocalDate
        LocalDate fechaAlquiler = LocalDate.now();
        LocalDate fechaDevolucion = fechaAlquiler.plusDays(7); // Se utiliza como ejemplo un plazo de 7 días
        Alquiler alquiler = new Alquiler("Pepe Gomez", "37225124", fechaAlquiler,
                fechaDevolucion, 1, yate);

        // Se calcula el precio del alquiler y se muestra
        double precioAlquiler = alquiler.calcularPrecioAlquiler();
        System.out.println("Precio del alquiler: " + precioAlquiler + " $.");
    }
}