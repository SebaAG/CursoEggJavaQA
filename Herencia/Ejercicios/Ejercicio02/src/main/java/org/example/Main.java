package org.example;

import org.example.entity.Lavadora;
import org.example.entity.Televisor;

public class Main {
    public static void main(String[] args) {

        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora(50000, "blanco", 'B', 50, 8);
        televisor.crearTelevisor(32000, "negro", 'A', 15, 50,
                true);

        System.out.println("Precio final de la lavadora: " + lavadora.precioFinal());
        System.out.println("Precio final del televisor: " + televisor.precioFinal());
    }
}