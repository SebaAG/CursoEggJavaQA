package service;

import entidad.Libro;

import java.util.Scanner;

public class LibroService {

    private final Scanner tecla = new Scanner(System.in);
    private final Libro libro = new Libro();

    public Libro cargaLibro() {
        Libro libro = new Libro();
        System.out.print("Ingresar numero de ISBN: ");
        libro.setIsbn(tecla.nextInt());
        System.out.print("Ingrese titulo del libro: ");
        libro.setTitulo(tecla.next());
        System.out.print("Ingrese nombre del autor: ");
        libro.setAutor(tecla.next());
        System.out.print("ingrese el numero de paginas: ");
        libro.setNumPag(tecla.nextInt());
        return libro;
    }
}
