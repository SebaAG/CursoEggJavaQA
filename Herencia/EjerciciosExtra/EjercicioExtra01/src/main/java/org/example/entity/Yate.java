package org.example.entity;

public class Yate extends Barco {

    private int potenciaCV;
    private int numCamarotes;

    public Yate(String matricula, double eslora, int annoFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, annoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }
}
