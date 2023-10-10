package org.example;

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
            if (num2 != 0) {
                int resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Ingrese números válidos en forma de cadena.");
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
        } finally {
            leer.close();
        }
    }
}