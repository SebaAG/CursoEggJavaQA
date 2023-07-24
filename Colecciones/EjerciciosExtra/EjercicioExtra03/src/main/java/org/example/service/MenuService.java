package org.example.service;

import org.example.entidad.Libro;

import java.util.Scanner;

public class MenuService {

    private static final Scanner tecla = new Scanner(System.in);
    private final LibroService libroService = new LibroService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 5);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. AGREGAR LIBRO
                2. PRESTAR LIBRO
                3. DEVOLVER LIBRO
                4. MOSTRAR LIBROS
                5. SALIR""");

        System.out.println();
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> agregarLibro();
            case 2 -> prestarLibro();
            case 3 -> devolverLibro();
            case 4 -> libroService.mostrarLibros();
            case 5 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }

    private void devolverLibro() {
        tecla.nextLine();
        System.out.println("Ingrese el título del libro que desea devolver: ");
        String libroDevolver = tecla.nextLine();
        if (libroService.libroDevolucion(libroDevolver)) {
            System.out.println("Libro devuelto de forma exitosa!");
        } else {
            System.out.println("No se pudo realizar la devolución!");
        }
    }

    private void prestarLibro() {
        tecla.nextLine();
        System.out.println("Ingrese el título del libro que desea prestar: ");
        String libroPrestar = tecla.nextLine();
        if (libroService.libroPrestado(libroPrestar)) {
            System.out.println("Libro prestado con exito!");
        } else {
            System.out.println("No se encuentra ese libro!");
        }
    }

    private void agregarLibro() {
        tecla.nextLine();
        System.out.println("Ingrese título del libro: ");
        String titulo = tecla.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String autor = tecla.nextLine();
        System.out.println("Ingrese numero de ejemplares del libro: ");
        int ejemplares = tecla.nextInt();
        System.out.println("Ingrese numero de ejemplares prestados del libro: ");
        int ejempPrestados = tecla.nextInt();
        Libro libro = new Libro(titulo, autor, ejemplares, ejempPrestados);
        libroService.agregarLibro(libro);
    }
}
