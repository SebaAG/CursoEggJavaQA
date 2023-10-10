package org.example.entity;

public class CalculadoraMatriz {
         public int[][] sumar(int[][] matrix1, int[][] matrix2) {
            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                throw new IllegalArgumentException("Matrices deben ser de la misma dimension");
            }
            int filas = matrix1.length;
            int columnas = matrix1[0].length;
            int[][] resultado = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return resultado;
        }

        public int[][] restar(int[][] matrix1, int[][] matrix2) {
            if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                throw new IllegalArgumentException("Matrices deben ser de las mismas dimensiones");
            }
            int filas = matrix1.length;
            int columnas = matrix1[0].length;
            int[][] resultado = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return resultado;
        }

        public int[][] multiplicar(int[][] matrix1, int[][] matrix2) {
            if (matrix1[0].length != matrix2.length) {
                throw new IllegalArgumentException("Matrices no son de dimensiones compatibles");
            }
            int filas1 = matrix1.length;
            int columnas1 = matrix1[0].length;
            int columnas2 = matrix2[0].length;
            int[][] resultado = new int[filas1][columnas2];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    int sum = 0;
                    for (int k = 0; k < columnas1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    resultado[i][j] = sum;
                }
            }
            return resultado;
        }
    }



