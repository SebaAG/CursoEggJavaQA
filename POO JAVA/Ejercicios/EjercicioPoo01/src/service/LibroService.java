package service;

import entidad.Libro;

import java.util.Scanner;

public class LibroService {

    private final Scanner tecla = new Scanner(System.in);

    /**
     * Carga los datos de un libro ingresados por el usuario.
     *
     * @return el libro cargado con los datos ingresados.
     */
    public Libro cargaLibro() {
        Libro libro = new Libro();

        // Se solicita al usuario que ingrese el número de ISBN del libro.
        System.out.print("Ingresar numero de ISBN: ");
        libro.setIsbn(tecla.nextInt());

        // Se solicita al usuario que ingrese el título del libro.
        System.out.print("Ingrese título del libro: ");
        libro.setTitulo(tecla.next());

        // Se solicita al usuario que ingrese el nombre del autor del libro.
        System.out.print("Ingrese nombre del autor: ");
        libro.setAutor(tecla.next());

        // Se solicita al usuario que ingrese el número de páginas del libro.
        System.out.print("Ingrese el número de páginas: ");
        libro.setNumPag(tecla.nextInt());

        return libro;
    }
}