package org.example.entity;

import org.example.service.CalculoFormas;

public class Circulo implements CalculoFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
}
