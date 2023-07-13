package service;

import entidad.Meses;
import java.util.Scanner;

public class MesesService {

    private final Scanner tecla = new Scanner(System.in);

    public Meses crearMeses() {
        return new Meses();
    }

    public void adivinar(Meses meses) {
        String mesTecla;
        System.out.println("Ingrese un mes: ");
        do {
            mesTecla = tecla.next();
            if (!mesTecla.toLowerCase().equals(meses.getMesSecreto())) {
                System.out.println("No era el mes, intentelo denuevo!");
            }
        } while (!mesTecla.toLowerCase().equals(meses.getMesSecreto()));
        System.out.println("Es el mes correcto!");
    }
}