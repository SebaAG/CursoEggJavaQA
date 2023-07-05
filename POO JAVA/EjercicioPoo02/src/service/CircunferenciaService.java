package service;

import entidad.Circunferencia;

import java.util.Scanner;

public class CircunferenciaService {
    private final Scanner tecla = new Scanner(System.in);
    /**
     * Crea una instancia de la clase Circunferencia a partir del radio ingresado por el usuario.
     *
     * @return la circunferencia creada.
     */
    public Circunferencia crearCirc() {
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = tecla.nextDouble();

        Circunferencia circun = new Circunferencia();
        circun.setRadio(radio);
        return circun;
    }
    /**
     * Calcula el área de una circunferencia.
     *
     * @param circunferencia la circunferencia de la cual se desea calcular el área.
     * @return el área de la circunferencia.
     */
    public double areaCirc(Circunferencia circunferencia) {
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }
    /**
     * Calcula el perímetro de una circunferencia.
     *
     * @param circunferencia la circunferencia de la cual se desea calcular el perímetro.
     * @return el perímetro de la circunferencia.
     */
    public double perimCirc(Circunferencia circunferencia) {
        return 2 * Math.PI * circunferencia.getRadio();
    }
    /**
     * Muestra el resultado del cálculo del área y el perímetro de una circunferencia.
     *
     * @param circunferencia la circunferencia de la cual se desea mostrar el resultado.
     */
    public void mostrarResult(Circunferencia circunferencia) {
        double area = areaCirc(circunferencia);
        double perimetro = perimCirc(circunferencia);

        System.out.printf("El área es: %.2f\n", area);
        System.out.printf("El perímetro es: %.2f\n", perimetro);
    }
}