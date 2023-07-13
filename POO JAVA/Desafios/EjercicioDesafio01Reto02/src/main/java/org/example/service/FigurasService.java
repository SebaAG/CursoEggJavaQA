package org.example.service;

import org.example.entidad.Figuras;

public class FigurasService {
    public double calcularArea(Figuras figura) {
        double area = 0;
        String tipo = figura.getTipo().toLowerCase();

        switch (tipo) {
            case "cuadrado" -> area = figura.getMedida1() * figura.getMedida1();
            case "rectángulo" -> area = figura.getMedida1() * figura.getMedida2();
            case "triangulo", "rombo" -> area = (figura.getMedida1() * figura.getMedida2()) / 2;
            case "circulo" -> area = Math.PI * Math.pow(figura.getMedida1(), 2);
            case "pentágono" -> area = (5 * Math.pow(figura.getMedida1(), 2) * Math.tan(Math.toRadians(54))) / 4;
            case "hexágono" -> area = (3 * Math.sqrt(3) * Math.pow(figura.getMedida1(), 2)) / 2;
            default -> System.out.println("Figura no válida");
        }
        return area;
    }

    public double calcularPerimetro(Figuras figura) {
        double perimetro = 0;
        String tipo = figura.getTipo().toLowerCase();

        switch (tipo) {
            case "cuadrado", "rombo" -> perimetro = 4 * figura.getMedida1();
            case "rectángulo" -> perimetro = 2 * (figura.getMedida1() + figura.getMedida2());
            case "triangulo" -> perimetro = figura.getMedida1() + figura.getMedida2() + figura.getMedida2();
            case "circulo" -> perimetro = 2 * Math.PI * figura.getMedida1();
            case "pentágono" -> perimetro = 5 * figura.getMedida1();
            case "hexágono" -> perimetro = 6 * figura.getMedida1();
            default -> System.out.println("Figura no válida");
        }
        return perimetro;
    }
}