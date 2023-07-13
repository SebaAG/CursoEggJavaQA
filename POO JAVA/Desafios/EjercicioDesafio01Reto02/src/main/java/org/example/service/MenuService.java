package org.example.service;

import org.example.entidad.Figuras;

import java.util.Scanner;

public class MenuService {

    private final FigurasService fs = new FigurasService();
    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 2);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. Calcular área y perímetro de una figura
                2. Salir""");
    }

    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> calcularAreaPerimetro();
            case 2 -> System.out.println("Adiós!");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void calcularAreaPerimetro() {
        int figuraOption;
        do {
            showFiguraMenu();
            figuraOption = obtFiguraOption();
        } while (figuraOption < 1 || figuraOption > 7);

        String tipo = obtenerTipoFigura(figuraOption);
        Figuras figura = obtenerMedidasFigura(tipo);

        double area = fs.calcularArea(figura);
        double perimetro = fs.calcularPerimetro(figura);

        System.out.println("Resultados para la figura " + tipo + ":");
        System.out.println("-------------------------------");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("-------------------------------");

    }

    private static void showFiguraMenu() {
        System.out.println("""
                Seleccione la figura geométrica:
                1. Cuadrado
                2. Rectángulo
                3. Triángulo
                4. Círculo
                5. Pentágono
                6. Hexágono
                7. Rombo""");
    }

    private static int obtFiguraOption() {
        System.out.println("Seleccione la opción de la figura: ");
        return tecla.nextInt();
    }

    private static String obtenerTipoFigura(int figuraOption) {
        return switch (figuraOption) {
            case 1 -> "cuadrado";
            case 2 -> "rectángulo";
            case 3 -> "triangulo";
            case 4 -> "circulo";
            case 5 -> "pentágono";
            case 6 -> "hexágono";
            case 7 -> "rombo";
            default -> "";
        };
    }

    private static Figuras obtenerMedidasFigura(String tipo) {
        double medida1, medida2, medida3;

        if (tipo.equals("triangulo")) {
            System.out.println("Ingrese las medidas del triángulo:");
            System.out.println("Ingresar medida del lado 1: ");
            medida1 = tecla.nextDouble();
            System.out.println("Ingresar medida del lado 2: ");
            medida2 = tecla.nextDouble();
            System.out.println("Ingresar medida del lado 3: ");
            medida3 = tecla.nextDouble();
        } else if (tipo.equals("rectangulo")) {
            System.out.println("Ingrese las medidas del rectángulo:");
            System.out.println("Ingresar largo: ");
            medida1 = tecla.nextDouble();
            System.out.println("Ingresar ancho: ");
            medida2 = tecla.nextDouble();
            medida3 = 0; // Asignar un valor por defecto para medida3
        } else if (tipo.equals("cuadrado")) {
            System.out.println("Ingrese la medida del lado del cuadrado:");
            medida1 = tecla.nextDouble();
            medida2 = 0; // Asignar un valor por defecto para medida2
            medida3 = 0; // Asignar un valor por defecto para medida3
        } else if (tipo.equals("circulo")) {
            System.out.println("Ingrese el radio del círculo:");
            medida1 = tecla.nextDouble();
            medida2 = 0; // Asignar un valor por defecto para medida2
            medida3 = 0; // Asignar un valor por defecto para medida3
        } else if (tipo.equals("pentagono")) {
            System.out.println("Ingrese la medida del lado del pentágono:");
            medida1 = tecla.nextDouble();
            medida2 = 0; // Asignar un valor por defecto para medida2
            medida3 = 0; // Asignar un valor por defecto para medida3
        } else if (tipo.equals("hexagono")) {
            System.out.println("Ingrese la medida del lado del hexágono:");
            medida1 = tecla.nextDouble();
            medida2 = 0; // Asignar un valor por defecto para medida2
            medida3 = 0; // Asignar un valor por defecto para medida3
        } else {
            System.out.println("Ingrese las medidas de la figura:");
            System.out.println("Ingresar primer valor: ");
            medida1 = tecla.nextDouble();
            System.out.println("Ingresar segundo valor: ");
            medida2 = tecla.nextDouble();
            medida3 = 0; // Asignar un valor por defecto para medida3
        }

        return new Figuras(tipo, medida1, medida2, medida3);
    }
}