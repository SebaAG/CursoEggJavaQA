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
        System.out.println("""
                *** MENU ***
                1. CREAR PERSONA
                2. MOSTRAR PERSONA
                3. CALCULAR EDAD
                4. SALIR""");

    }
    /**
     * Obtiene la opción seleccionada por el usuario.
     *
     * @return la opción seleccionada
     */
    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    /**
     * Ejecuta la opción seleccionada por el usuario.
     *
     * @param opc la opción seleccionada
     */
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
