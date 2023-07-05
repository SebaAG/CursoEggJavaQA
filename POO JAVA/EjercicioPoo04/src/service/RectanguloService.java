package service;

import entidad.Rectangulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class RectanguloService {
    private final Scanner tecla = new Scanner(System.in);
    private final Rectangulo recta = new Rectangulo();

    public void crearRectangulo() {
        System.out.print("Ingresar valor de la base: ");
        recta.setBase(tecla.nextBigDecimal());
        System.out.print("Ingresar valor de la altura: ");
        recta.setAltura(tecla.nextBigDecimal());
    }

    public void calcSuperficie() {
        BigDecimal superficie = recta.getBase().multiply(recta.getAltura());
        System.out.println("La superficie es: " + superficie);
    }

    public void calcPerimetro() {
        BigDecimal suma = recta.getBase().add(recta.getAltura());
        BigDecimal perimetro = suma.multiply(new BigDecimal(2));
        System.out.println("El perímetro es: " + perimetro);
    }

    public void dibujarRecta() {
        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(recta.getAltura()) < 0; i = i.add(BigDecimal.ONE)) {
            for (BigDecimal j = BigDecimal.ZERO; j.compareTo(recta.getBase()) < 0; j = j.add(BigDecimal.ONE)) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
