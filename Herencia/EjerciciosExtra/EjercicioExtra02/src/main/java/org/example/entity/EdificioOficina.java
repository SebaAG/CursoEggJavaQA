package org.example.entity;

public class EdificioOficina extends Edificio{

    private int numOficinas;
    private int personasOficina;
    private int numPisos;

    public EdificioOficina(double ancho, double alto, double largo, int numOficinas, int personasOficina, int numPisos){
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasOficina = personasOficina;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + alto * largo + alto * ancho);
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        return personasOficina * numOficinas + personasOficina * numPisos;
    }
}
