package service;

import java.util.Scanner;

public class MenuService {
    private static final Scanner tecla = new Scanner(System.in);
    private final CafeteraService cs = new CafeteraService();

    // EJECUTA EL MENU DE OPCIONES EN EL METODO PRINCIPAL
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 4);
    }
    // SE MUESTRA EL MENU DE LA APP
    private static void showMenu() {
        System.out.println("*** MENU ***" + '\n' +
                "1. LLENAR CAFETERA" + '\n' +
                "2. SERVIR CAFE" + '\n' +
                "3. VACIAR CAFETERA" + '\n' +
                "4. SALIR");
    }
    // SE INGRESA EL NUMERO DESEADO PARA CADA OPCION DEL MENU
    private static int obtOpc() {

        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    // SWITCH PARA EJECUTAR LA OPCIÓN SELECCIONADA
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
