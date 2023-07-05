package service;

import entidad.Rectangulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class RectanguloService {
    private final Scanner tecla = new Scanner(System.in);
    private final Rectangulo recta = new Rectangulo();
    /**
     * Permite al usuario ingresar los valores de la base y la altura para crear un rectángulo.
     * Los valores ingresados se asignan a los atributos base y altura de la instancia Rectangulo.
     */
    public void crearRectangulo() {
        System.out.print("Ingresar valor de la base: ");
        recta.setBase(tecla.nextBigDecimal());
        System.out.print("Ingresar valor de la altura: ");
        recta.setAltura(tecla.nextBigDecimal());
    }
    /**
     * Calcula la superficie del rectángulo utilizando los valores de base y altura almacenados en la instancia Rectangulo.
     * Muestra la superficie por pantalla.
     */
    public void calcSuperficie() {
        BigDecimal superficie = recta.getBase().multiply(recta.getAltura());
        System.out.println("La superficie es: " + superficie);
    }
    /**
     * Calcula el perímetro del rectángulo utilizando los valores de base y altura almacenados en la instancia Rectangulo.
     * Muestra el perímetro por pantalla.
     */
    public void calcPerimetro() {
        BigDecimal suma = recta.getBase().add(recta.getAltura());
        BigDecimal perimetro = suma.multiply(new BigDecimal(2));
        System.out.println("El perímetro es: " + perimetro);
    }
    /**
     * Dibuja el rectángulo utilizando asteriscos (*) en la consola.
     * El tamaño del rectángulo está determinado por los valores de base y altura almacenados en la instancia Rectangulo.
     */
    public void dibujarRecta() {
        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(recta.getAltura()) < 0; i = i.add(BigDecimal.ONE)) {
            for (BigDecimal j = BigDecimal.ZERO; j.compareTo(recta.getBase()) < 0; j = j.add(BigDecimal.ONE)) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}