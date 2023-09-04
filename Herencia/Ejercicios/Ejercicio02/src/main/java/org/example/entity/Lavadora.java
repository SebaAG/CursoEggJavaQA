package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }
    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

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
