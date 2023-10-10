package org.example.entity;

import java.security.SecureRandom;
import java.util.Random;

public class GeneradorClaveSegura {
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIALES = "!@#$%^&*_=+-/";

    private static final int LONGITUD_MINIMA = 12;

    private static final String TODOS_CARACTERES = MAYUSCULAS + MINUSCULAS + NUMEROS + CARACTERES_ESPECIALES;

    private final Random random;

    public GeneradorClaveSegura() {
        random = new SecureRandom();
    }

    public String generarClaveSegura() {
        StringBuilder clave = new StringBuilder();

        // Agregar al menos una mayúscula
        clave.append(obtenerCaracterAleatorio(MAYUSCULAS));

        // Agregar al menos una minúscula
        clave.append(obtenerCaracterAleatorio(MINUSCULAS));

        // Agregar al menos un número
        clave.append(obtenerCaracterAleatorio(NUMEROS));

        // Agregar al menos un carácter especial
        clave.append(obtenerCaracterAleatorio(CARACTERES_ESPECIALES));

        // Rellenar el resto de la clave con caracteres aleatorios
        int longitudRestante = LONGITUD_MINIMA - clave.length();
        for (int i = 0; i < longitudRestante; i++) {
            clave.append(obtenerCaracterAleatorio(TODOS_CARACTERES));
        }

        // Mezclar los caracteres de la clave para mayor seguridad
        return mezclarClave(clave.toString());
    }

    private char obtenerCaracterAleatorio(String conjuntoCaracteres) {
        int indice = random.nextInt(conjuntoCaracteres.length());
        return conjuntoCaracteres.charAt(indice);
    }

    private String mezclarClave(String clave) {
        char[] claveArray = clave.toCharArray();
        for (int i = 0; i < claveArray.length; i++) {
            int indiceAleatorio = random.nextInt(claveArray.length);
            char temp = claveArray[i];
            claveArray[i] = claveArray[indiceAleatorio];
            claveArray[indiceAleatorio] = temp;
        }
        return new String(claveArray);
    }

    public int obtenerLongitudMinima() {
        return LONGITUD_MINIMA;
    }
}
