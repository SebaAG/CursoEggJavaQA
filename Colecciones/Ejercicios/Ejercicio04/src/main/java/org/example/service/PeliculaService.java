package org.example.service;

import org.example.entidad.Pelicula;

import java.util.*;

public class PeliculaService {

    private final List<Pelicula> listaPeli = new ArrayList<>();
    private static final Scanner tecla = new Scanner(System.in);

    public void crearPeliculas() {
        boolean otra = true;
        while (otra) {
            System.out.println("Ingrese el titulo de la película: ");
            String titulo = tecla.nextLine();
            System.out.println("Ingrese el nombre del director: ");
            String director = tecla.nextLine();
            System.out.println("Ingrese la duración de la película (en minutos): ");
            int duracion = tecla.nextInt();
            tecla.nextLine();

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            listaPeli.add(pelicula);


            System.out.println("Desea crear otra película? (S/N): ");
            String resp = tecla.next();
            otra = resp.equalsIgnoreCase("s");
            tecla.nextLine();
        }
    }

    public void mostrarPeliculas() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            System.out.println("***** LISTA DE PELICULAS *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                        "Director: " + pelicula.getDirector() + '\n' +
                        "Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }

    public void mostrarPeliculasDuracionHora() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            System.out.println("***** PELÍCULAS CON DURACIÓN MAYOR A 1 HORA *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                if (pelicula.getDuracion() > 60) {
                    System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                            "Director: " + pelicula.getDirector() + '\n' +
                            "Duración: " + pelicula.getDuracion() + " minutos");
                    System.out.println();
                }
            }
            System.out.println("--------------------------------");
        }
    }

    public void ordenarPeliculasDuracionMayor() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            listaPeli.sort(Comparator.comparingInt(Pelicula::getDuracion).reversed());
            System.out.println("***** PELÍCULAS ORDENADAS POR DURACIÓN (mayor a menor) *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                        "Director: " + pelicula.getDirector() + '\n' +
                        "Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }

    public void ordenarPeliculasDuracionMenor() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            listaPeli.sort(Comparator.comparingInt(Pelicula::getDuracion));
            System.out.println("***** PELÍCULAS ORDENADAS POR DURACIÓN (menor a mayor) *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                        "Director: " + pelicula.getDirector() + '\n' +
                        "Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }

    public void ordenarPeliculaTitulo() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            listaPeli.sort(Comparator.comparing(Pelicula::getTitulo));
            System.out.println("***** PELÍCULAS ORDENADAS POR TITULO *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                        "Director: " + pelicula.getDirector() + '\n' +
                        "Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }

    public void ordenarPeliculaDirector() {
        if (listaPeli.isEmpty()) {
            System.out.println("NO HAY PELÍCULAS DISPONIBLES");
        } else {
            listaPeli.sort(Comparator.comparing(Pelicula::getDirector));
            System.out.println("***** PELÍCULAS ORDENADAS POR DIRECTOR *****");
            System.out.println();
            for (Pelicula pelicula : listaPeli) {
                System.out.println("Titulo: " + pelicula.getTitulo() + '\n' +
                        "Director: " + pelicula.getDirector() + '\n' +
                        "Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }
}
