package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class AnalizadorTexto {
    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    public static int contarFrases(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        String[] frases = texto.trim().split("[.!?]+");
        return frases.length;
    }

    public static Map<String, Integer> obtenerFrecuenciaPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return new HashMap<>();
        }
        String[] palabras = texto.trim().split("\\s+");
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        return frecuenciaPalabras;
    }
}
