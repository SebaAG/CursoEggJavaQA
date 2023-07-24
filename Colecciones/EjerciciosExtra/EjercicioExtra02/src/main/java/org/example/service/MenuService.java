package org.example.service;

import java.util.Scanner;

public class MenuService {

    private static final Scanner tecla = new Scanner(System.in);
    private final CantanteFamosoService cfs = new CantanteFamosoService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 4);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. AGREGAR CANTANTE Y DISCO
                2. MOSTRAR CANTANTES Y DISCO
                3. ELIMINAR CANTANTE
                4. SALIR""");

        System.out.println();
    }

    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> agregarCantantes();
            case 2 -> cfs.mostrarCantantes();
            case 3 -> cfs.eliminarCantante();
            case 4 -> System.out.println("Adios!");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void agregarCantantes() {
        tecla.nextLine();
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = tecla.nextLine();
        System.out.println("Ingrese el disco con más ventas: ");
        String discoMasVentas = tecla.nextLine();
        cfs.agregarCantante(nombre, discoMasVentas);
    }
}