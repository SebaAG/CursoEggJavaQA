package org.example;

public class ArrayExcepcion {
    private int[] arreglo;

    public ArrayExcepcion(int tamaño) {
        arreglo = new int[tamaño];
    }

    public void asignarValor(int indice, int valor) {
        try {
            arreglo[indice] = valor;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Índice fuera de rango. El tamaño del arreglo es " + arreglo.length);
        }
    }

    public int obtenerValor(int indice) {
        try {
            return arreglo[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Índice fuera de rango. El tamaño del arreglo es " + arreglo.length);
            return -1;
        }
    }
}