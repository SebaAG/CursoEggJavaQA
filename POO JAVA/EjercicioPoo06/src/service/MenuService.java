package service;

import java.util.Scanner;

public class MenuService {
    private static final Scanner tecla = new Scanner(System.in);
    private final CafeteraService cs = new CafeteraService();
    /**
     * Ejecuta el menú de opciones en el método principal.
     */
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 4);
    }
    /**
     * Muestra el menú de la aplicación con las opciones disponibles.
     */
    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. LLENAR CAFETERA
                2. SERVIR CAFE
                3. VACIAR CAFETERA
                4. SALIR""");
    }
    /**
     * Obtiene el número de la opción seleccionada por el usuario.
     * @return El número de la opción seleccionada.
     */
    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    /**
     * Ejecuta la opción seleccionada por el usuario.
     * @param opc El número de la opción seleccionada.
     */
    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> {
                System.out.println("Ingrese la cantidad de café a agregar (máxima cantidad 1000ml): ");
                int cantidad = tecla.nextInt();
                cs.agregarCafe(cantidad);
            }
            case 2 -> {
                System.out.println("Ingrese la cantidad de café a servir: ");
                int taza = tecla.nextInt();
                cs.servirCafe(taza);
            }
            case 3 -> cs.vaciarCafetera();
            case 4 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}