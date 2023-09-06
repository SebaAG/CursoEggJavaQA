package org.example.entity;

public class Polideportivo extends Edificio{

    private String nombre;
    private String tipoInstall;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstall) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstall = tipoInstall;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + alto * largo + alto * ancho);
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public String getTipoInstall() {
        return tipoInstall;
    }
}
