package service;

import java.util.Scanner;

public class MenuService {

    private final PersonaService service = new PersonaService();
    private static final Scanner tecla = new Scanner(System.in);

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
                "1. CREAR PERSONA" + '\n' +
                "2. MOSTRAR PERSONA" + '\n' +
                "3. CALCULAR EDAD" + '\n' +
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
            case 1 -> service.crearPersona();
            case 2 -> service.mostrarPersona();
            case 3 -> {
                System.out.println("Ingrese la edad a comparar: ");
                int edad = tecla.nextInt();
                boolean esMenor = service.menorQue(edad);
                System.out.println("¿Es menor que " + edad + "? " + (esMenor ? "Sí" : "No"));
            }
            case 4 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
