package org.example.entity;


public class Velero extends Barco{

    private int numMastil;

    public Velero(String matricula, double eslora, int annoFabricacion, int numMastil) {
        super(matricula, eslora, annoFabricacion);
        this.numMastil = numMastil;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numMastil;
    }
}
