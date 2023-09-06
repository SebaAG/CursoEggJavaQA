package org.example;

import org.example.entity.Edificio;
import org.example.entity.EdificioOficina;
import org.example.entity.Polideportivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo(120, 20, 100, "Polideportivo A", "Techado"));
        edificios.add(new Polideportivo(100, 25, 150, "Polideportivo B", "Abierto"));
        edificios.add(new EdificioOficina(40, 15, 25, 6, 10, 3));
        edificios.add(new EdificioOficina(40, 22, 30, 12, 12, 4));

        // Recorrer el ArrayList y mostrar superficie y volumen de cada edificio
        for (Edificio edificio : edificios) {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Tipo de instalación: " + polideportivo.getTipoInstall());
            } else if (edificio instanceof EdificioOficina) {
                EdificioOficina edifOficinas = (EdificioOficina) edificio;
                System.out.println("Cantidad de personas: " + edifOficinas.cantPersonas());
            }

            System.out.println();
        }

        int techados = 0;
        int abiertos = 0;

        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstall().equals("Techado")) {
                    techados++;
                } else if (polideportivo.getTipoInstall().equals("Abierto")) {
                    abiertos++;
                }
            }
        }

        System.out.println("Polideportivos Techados: " + techados);
        System.out.println("Polideportivos Abiertos: " + abiertos);
    }
}