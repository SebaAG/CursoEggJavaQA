package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        try {
            // Leer dos números en forma de cadena
            System.out.print("Ingrese el primer número: ");
            String num1Str = leer.nextLine();

            System.out.print("Ingrese el segundo número: ");
            String num2Str = leer.nextLine();

            // Convertir las cadenas a tipo int
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // Realizar la división
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException e) {
            System.err.println("Error: Ingreso de datos incorrecto. Debe ingresar números enteros.");
        } catch (NumberFormatException e) {
            System.err.println("Error: No se puede convertir la cadena en un número entero válido.");
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            leer.close();
        }
    }

    public static int dividir(int numerador, int denominador) {
        try {
            return numerador / denominador;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("División por cero.");
        }
    }
}
