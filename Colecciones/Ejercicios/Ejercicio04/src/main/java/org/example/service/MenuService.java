package org.example.service;

import java.util.Scanner;

public class MenuService {

    private static Scanner tecla = new Scanner(System.in);
    private PeliculaService ps = new PeliculaService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 8);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. CARGAR PELÍCULA
                2. MOSTRAR LISTA DE PELÍCULAS
                3. MOSTRAR PELÍCULAS POR DURACIÓN (mayor a 1 hora)
                4. ORDENAR PELÍCULAS POR DURACIÓN (mayor a menor)
                5. ORDENAR PELÍCULAS POR DURACIÓN (menor a mayor)
                6. ORDENAR PELÍCULAS POR TITULO
                7. ORDENAR PELÍCULAS POR DIRECTOR
                8. SALIR""");

        System.out.println("""
                """);
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> ps.crearPeliculas();
            case 2 -> ps.mostrarPeliculas();
            case 3 -> ps.mostrarPeliculasDuracionHora();
            case 4 -> ps.ordenarPeliculasDuracionMayor();
            case 5 -> ps.ordenarPeliculasDuracionMenor();
            case 6 -> ps.ordenarPeliculaTitulo();
            case 7 -> ps.ordenarPeliculaDirector();
            case 8 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
