package org.example.service;

import java.util.Scanner;

public class MenuService {

    private static Scanner tecla = new Scanner(System.in);
    private PaisService ps = new PaisService();

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
                1. CARGAR PAÍSES
                2. MOSTRAR PAÍSES
                3. MOSTRAR PAÍSES ORDENADOS
                4. ELIMINAR PAÍS
                5. SALIR""");

        System.out.println("""
                """);
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> ps.cargarPaises();
            case 2 -> ps.mostrarPaises();
            case 3 -> ps.mostrarPaisesOrdenados();
            case 4 -> ps.eliminarPais();
            case 5 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
