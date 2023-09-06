package org.example.entity;


public class MotorBarco extends Barco {

    private int potenciaCV;

    public MotorBarco(String matricula, double eslora, int annoFabricacion, int potenciaCV) {
        super(matricula, eslora, annoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}
