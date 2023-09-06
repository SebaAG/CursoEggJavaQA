package org.example.entity;

public class Barco {

    private String matricula;
    private double eslora;
    private int annoFabricacion;

    public Barco(String matricula, double eslora, int annoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
    }

    public double calcularModulo() {
        return eslora * 10;
    }
}
