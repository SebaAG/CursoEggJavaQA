package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayExcepcion ejemplo = new ArrayExcepcion(5);

        ejemplo.asignarValor(0, 10);
        ejemplo.asignarValor(5, 20);

        int valor = ejemplo.obtenerValor(0);
        System.out.println("Valor obtenido: " + valor);

        valor = ejemplo.obtenerValor(6);
        System.out.println("Valor obtenido: " + valor);
    }
}