package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroService {

    private final ArrayList<Integer> num = new ArrayList<>();
    private final Scanner tecla = new Scanner(System.in);


    public void crearNumero() {
        int numero;
        do {
            System.out.println("Ingrese un numero entero (-99 para salir): ");
            numero = tecla.nextInt();
            if (numero != -99) {
                num.add(numero);
            }
        } while (numero != -99);
    }

    public void calcularNum() {
        int cantValores = num.size();
        int suma = 0;
        for (int n : num) {
            suma += n;
        }
        double media = (double) suma / cantValores;
        System.out.println("Numero de valores leídos: " + cantValores + '\n' +
                "Suma de los valores: " + suma + '\n' +
                "Media de los valores: " + media);
    }

}
