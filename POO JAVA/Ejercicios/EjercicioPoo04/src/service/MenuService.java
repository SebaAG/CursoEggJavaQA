package service;

import java.util.Scanner;

public class MenuService {
    private static final Scanner tecla = new Scanner(System.in);
    private final RectanguloService service = new RectanguloService();
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 5);
    }
    // SE MUESTRA EL MENU DE LA APP
    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. CREAR RECTANGULO
                2. CALCULAR SUPERFICIE
                3. CALCULAR PERIMETRO
                4. DIBUJAR RECTA
                5. SALIR""");


    }
    // SE INGRESA EL NUMERO DESEADO PARA CADA OPCION DEL MENU
    private static int obtOpc() {

        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }
    // SWITCH PARA EJECUTAR LA OPCIÓN SELECCIONADA
    private void ejectOpc(int opc) {

        switch (opc) {
            case 1 -> service.crearRectangulo();
            case 2 -> service.calcSuperficie();
            case 3 -> service.calcPerimetro();
            case 4 -> service.dibujarRecta();
            case 5 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }
}
