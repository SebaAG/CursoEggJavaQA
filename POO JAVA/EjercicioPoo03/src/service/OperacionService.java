package service;

import entidad.Operacion;

import java.util.Scanner;

public class OperacionService {
    private final Scanner tecla = new Scanner(System.in);
    private final Operacion ope = new Operacion();
    /**
     * Permite al usuario ingresar dos números para realizar operaciones matemáticas.
     * Los números ingresados se asignan a los atributos num1 y num2 de la instancia Operacion.
     */
    public void crearOperacion() {
        System.out.print("Ingresar el primer numero: ");
        ope.setNum1(tecla.nextInt());
        System.out.print("Ingresar el segundo numero: ");
        ope.setNum2(tecla.nextInt());
    }
    /**
     * Realiza la operación de suma utilizando los números almacenados en la instancia Operacion.
     * Muestra el resultado de la suma por pantalla.
     */
    public void sumar() {
        int suma = ope.getNum1() + ope.getNum2();
        System.out.println("La suma es: " + suma);
    }
    /**
     * Realiza la operación de resta utilizando los números almacenados en la instancia Operacion.
     * Muestra el resultado de la resta por pantalla.
     */
    public void restar() {
        int resta = ope.getNum2() - ope.getNum1();
        System.out.println("La resta es: " + resta);
    }
    /**
     * Realiza la operación de multiplicación utilizando los números almacenados en la instancia Operacion.
     * Muestra el resultado de la multiplicación por pantalla.
     * Si alguno de los números es cero, se muestra un mensaje indicando que no se puede multiplicar por cero.
     */
    public void multiplicar() {
        if (ope.getNum1() == 0 || ope.getNum2() == 0) {
            System.out.println("No se puede multiplicar por cero!");
        } else {
            int multip = ope.getNum1() * ope.getNum2();
            System.out.println("La multiplicacion es: " + multip);
        }
    }
    /**
     * Realiza la operación de división utilizando los números almacenados en la instancia Operacion.
     * Muestra el resultado de la división por pantalla.
     * Si el segundo número es cero, se muestra un mensaje indicando que no se puede dividir por cero.
     */
    public void dividir() {
        if (ope.getNum2() == 0) {
            System.out.println("No se puede dividir por cero!");
        } else {
            int div = ope.getNum2() / ope.getNum1();
            System.out.println("La division es: " + div);
        }
    }
}