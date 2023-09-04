package org.example;

import org.example.entity.Electrodomestico;
import org.example.entity.Lavadora;
import org.example.entity.Televisor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora(1200, "blanco", 'B', 50, 8);
        electrodomesticos.add(lavadora1);

        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor(1500, "negro", 'A', 30, 50, true);
        electrodomesticos.add(televisor1);

        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora(1800, "gris", 'C', 70, 12);
        electrodomesticos.add(lavadora2);

        Televisor televisor2 = new Televisor();
        televisor2.crearTelevisor(2000, "rojo", 'B', 45, 55, false);
        electrodomesticos.add(televisor2);

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
            System.out.println("Precio final del electrodomestico: " + precioFinal);
        }
        System.out.println("Precio total de electrodomesticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de televisores: " + precioTotalTelevisores);
    }
}