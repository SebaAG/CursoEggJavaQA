package service;

import entidad.Operacion;

import java.util.Scanner;

public class OperacionService {
    private final Scanner tecla = new Scanner(System.in);
    private final Operacion ope = new Operacion();

    public void crearOperacion() {
        System.out.print("Ingresar el primer numero: ");
        ope.setNum1(tecla.nextInt());
        System.out.print("Ingresar el segundo numero: ");
        ope.setNum2(tecla.nextInt());
    }

    public void sumar() {
        int suma = ope.getNum1() + ope.getNum2();
        System.out.println("La suma es: " + suma);
    }

    public void restar() {
        int resta = ope.getNum2() - ope.getNum1();
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar() {
        if (ope.getNum1() == 0 || ope.getNum2() == 0) {
            System.out.println("No se puede multiplicar por cero!");
        } else {
            int multip = ope.getNum1() * ope.getNum2();
            System.out.println("La multiplicacion es: " + multip);
        }
    }

    public void dividir() {
        if (ope.getNum2() == 0) {
            System.out.println("No se puede dividir por cero!");
        } else {
            int div = ope.getNum2() / ope.getNum1();
            System.out.println("La division es: " + div);
        }
    }
}
