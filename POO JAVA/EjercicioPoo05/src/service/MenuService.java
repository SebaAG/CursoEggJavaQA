package service;

import java.util.Scanner;

public class MenuService {
    private static final Scanner tecla = new Scanner(System.in);
    private final CuentaService cs = new CuentaService();
    // EJECUTA EL MENU DE OPCIONES EN EL METODO PRINCIPAL
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 7);
    }
    // SE MUESTRA EL MENU DE LA APP
    private static void showMenu() {
        System.out.println("""
                
                1.Crear Cuenta
                2.Consultar el saldo en la cuenta
                3.Depositar dinero
                4.Retirar dinero
                5.Extracción rápida
                6.Consultar Datos
                7.Salir""");

    }
    // SE INGRESA EL NUMERO DESEADO PARA CADA OPCION DEL MENU
    private static int obtOpc() {

        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    // SWITCH PARA EJECUTAR LA OPCIÓN SELECCIONADA
    private void ejectOpc(int opc) {

        switch (opc) {
            case 1 -> System.out.println(cs.crearCuenta());
            case 2 -> System.out.println(cs.consultarSaldo());
            case 3 -> {
                System.out.println("Ingrese la cantidad a depositar: ");
                int ingreso = tecla.nextInt();
                System.out.println(cs.masPlata(ingreso));
            }
            case 4 -> {
                System.out.println("Ingrese la cantidad a retirar: ");
                int retiro = tecla.nextInt();
                System.out.println(cs.menosPlata(retiro));
            }
            case 5 -> {
                System.out.println("Ingrese la cantidad a retirar (extracción rápida): ");
                int retiroRapido = tecla.nextInt();
                System.out.println(cs.plataRapida(retiroRapido));
            }
            case 6 -> System.out.println(cs.consultarDatos());
            case 7 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
