package org.example.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
                    int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecioAlquiler() {
        long difDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double moduloBarco = barco.calcularModulo();
        return difDias * moduloBarco;
    }
}
