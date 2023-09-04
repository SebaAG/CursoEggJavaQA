package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precio = 1000; // Valor base por defecto
        this.color = "blanco"; // Color por defecto
        this.consumoEnergetico = 'F'; // Se utiliza la 'F' por defecto
        this.peso = 5; // Peso por defecto
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso){
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnerg(consumoEnergetico);
        this.peso = peso;
    }

    private char comprobarConsumoEnerg(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "gris"};
        for (String coloresPresentes : colores) {
            if (color.equalsIgnoreCase(color)) {
                return coloresPresentes;
            }
        }
        return "blanco";
    }

    public void crearElectrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnerg(consumoEnergetico);
        this.peso = peso;
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
        }

}
