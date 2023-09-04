package org.example;

import org.example.entity.Caballo;
import org.example.entity.Gato;
import org.example.entity.Perro;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("pepe", "carne y pollo", 5, "rottweiler");
        Gato gato = new Gato("michifus", "pescado", 7, "siames");
        Caballo caballo = new Caballo("corcel", "heno", 4, "pura sangre");

        perro.Alimentandose();
        gato.Alimentandose();
        caballo.Alimentandose();
    }
}