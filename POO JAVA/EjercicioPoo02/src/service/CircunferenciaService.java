package service;

import entidad.Circunferencia;

import java.util.Scanner;

public class CircunferenciaService {
    private final Scanner tecla = new Scanner(System.in);
    private final Circunferencia circunferencia = new Circunferencia();

    public Circunferencia crearCirc() {
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = tecla.nextDouble();

        Circunferencia circun = new Circunferencia();
        circun.setRadio(radio);
        return circun;
    }

    public double areaCirc(Circunferencia circunferencia) {
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }

    public double perimCirc(Circunferencia circunferencia) {
        return 2 * Math.PI * circunferencia.getRadio();
    }

    public void mostrarResult(Circunferencia circunferencia) {
        double area = areaCirc(circunferencia);
        double perimetro = perimCirc(circunferencia);

        System.out.printf("El área es: %.2f\n", area);
        System.out.printf("El perímetro es: %.2f\n", perimetro);
    }
}