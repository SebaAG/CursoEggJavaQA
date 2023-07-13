package service;

import java.util.Scanner;

public class MenuService {
    private static final Scanner tecla = new Scanner(System.in);
    private final OperacionService opeServ = new OperacionService();
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 6);
    }
    // SE MUESTRA EL MENU DE LA APP
    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. CARGAR NUMEROS
                2. SUMAR
                3. RESTAR
                4. MULTIPLICAR
                5. DIVIDIR
                6. SALIR""");


    }
    // SE INGRESA EL NUMERO DESEADO PARA CADA OPCION DEL MENU
    private static int obtOpc() {

        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    // SWITCH PARA EJECUTAR LA OPCIÓN SELECCIONADA
    private void ejectOpc(int opc) {

        switch (opc) {
            case 1 -> opeServ.crearOperacion();
            case 2 -> opeServ.sumar();
            case 3 -> opeServ.restar();
            case 4 -> opeServ.multiplicar();
            case 5 -> opeServ.dividir();
            case 6 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}