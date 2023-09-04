package org.example.entity;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public void crearTelevisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
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