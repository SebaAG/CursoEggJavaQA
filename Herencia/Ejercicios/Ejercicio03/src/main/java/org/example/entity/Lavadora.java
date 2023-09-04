package org.example.entity;

public class Lavadora extends Electrodomestico{

    private double carga;

    public void crearLavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        crearElectrodomestico(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
