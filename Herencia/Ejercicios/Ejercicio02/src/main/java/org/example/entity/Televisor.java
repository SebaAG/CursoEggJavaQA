package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Televisor extends Electrodomestico{

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 32;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion,
                     boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(double precio, String color, char consumoEnergetico, double peso, int resolucion,
                               boolean sintonizadorTDT) {
        crearElectrodomestico(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal *= 1.3;
        }
        if (sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
