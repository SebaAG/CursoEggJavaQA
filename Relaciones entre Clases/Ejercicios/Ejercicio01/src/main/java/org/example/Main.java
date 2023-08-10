package org.example;

import org.example.entity.Perro;
import org.example.entity.Persona;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("perrito1", "caniche", 4, "pequeño");
        Perro perro2 = new Perro("perrito2", "calleja", 8, "grande");

        Persona persona1 = new Persona("pepe", "pepin", 22, "24785124", null);
        Persona persona2 = new Persona("mari", "maria", 29, "36112124", null);

        persona1.adoptar(perro1);
        persona2.adoptar(perro2);

        persona1.showInfo();
        System.out.println();
        persona2.showInfo();
    }
}