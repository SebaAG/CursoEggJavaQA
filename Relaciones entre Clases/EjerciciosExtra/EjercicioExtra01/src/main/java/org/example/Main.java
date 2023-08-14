package org.example;

import org.example.entity.Perro;
import org.example.entity.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Perro> perrosDisponibles = new ArrayList<>();
        perrosDisponibles.add(new Perro("perrito1", "caniche", 4, "pequeño"));
        perrosDisponibles.add(new Perro("perrito2", "calleja", 8, "grande"));

        Persona persona1 = new Persona("pepe", "pepin", 22, "24785124");
        Persona persona2 = new Persona("mari", "maria", 29, "36112124");

        Scanner scanner = new Scanner(System.in);

        for (Perro perro : perrosDisponibles) {
            System.out.println(persona1.getNombre() + ", ¿quieres adoptar al perro " + perro.getNombre() + "? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("S")) {
                persona1.adoptar(perro);
                perrosDisponibles.remove(perro);
                break;
            }
        }

        for (Perro perro : perrosDisponibles) {
            System.out.println(persona2.getNombre() + ", ¿quieres adoptar al perro " + perro.getNombre() + "? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("S")) {
                persona2.adoptar(perro);
                break;
            }
        }

        persona1.showInfo();
        System.out.println();
        persona2.showInfo();
    }
}