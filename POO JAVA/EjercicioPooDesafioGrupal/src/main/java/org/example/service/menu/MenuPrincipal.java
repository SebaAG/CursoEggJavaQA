package org.example.service.menu;

import java.util.Scanner;

public class MenuPrincipal {
    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");
    private final ClienteMenu cmenu = new ClienteMenu();
    private final RutinaMenu rmenu = new RutinaMenu();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 3);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. CLIENTES
                2. RUTINAS
                3. SALIR""");
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> cmenu.menuClientes();
            case 2 -> rmenu.menuRutinas();
            case 3 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}