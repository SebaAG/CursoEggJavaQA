package org.example.service;

import org.example.entidad.Libro;

import java.util.HashSet;
import java.util.Set;

public class LibroService {

    private final Set<Libro> libros = new HashSet<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    private Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }

    public boolean libroPrestado(String titulo) {
        Libro libroPrestado = buscarLibro(titulo);
        if (libroPrestado != null && libroPrestado.getEjempPrestados() < libroPrestado.getEjemplares()) {
            libroPrestado.setEjempPrestados(libroPrestado.getEjempPrestados() + 1);
            return true;
        }
        return false;
    }

    public boolean libroDevolucion(String titulo) {
        Libro libroDevolucion = buscarLibro(titulo);
        if (libroDevolucion != null && libroDevolucion.getEjemplares() > 0) {
            libroDevolucion.setEjempPrestados(libroDevolucion.getEjempPrestados() - 1);
            return true;
        }
        return false;
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la librería!");
        } else {
            System.out.println("***** LIBROS *****");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
