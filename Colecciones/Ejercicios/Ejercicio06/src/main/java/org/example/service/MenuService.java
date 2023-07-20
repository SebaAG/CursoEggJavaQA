package org.example.service;

import java.util.Scanner;

public class MenuService {

    private static Scanner tecla = new Scanner(System.in);
    private TiendaService ts = new TiendaService();

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
                1. AGREGAR PRODUCTO
                2. MODIFICAR PRECIO DE UN PRODUCTO
                3. ELIMINAR PRODUCTO
                4. MOSTRAR PRODUCTOS
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
            case 1 -> ts.agregarProducto();
            case 2 -> ts.modifPrecio();
            case 3 -> ts.eliminarProducto();
            case 4 -> ts.mostrarProductos();
            case 5 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
