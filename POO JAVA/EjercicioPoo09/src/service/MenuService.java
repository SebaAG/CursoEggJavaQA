package service;

import java.util.Scanner;

public class MenuService {
    MatematicaService service = new MatematicaService();
    private static final Scanner tecla = new Scanner(System.in);
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
                1. CARGAR NUMEROS ALEATORIOS
                2. MOSTRAR NUMEROS GENERADOS
                3. SABER NUMERO MAYOR
                4. CALCULAR POTENCIA
                5. CALCULAR RAIZ
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
            case 1 -> service.agregarNumeros();
            case 2 -> service.mostrarNumerosGenerados();
            case 3 -> {
                double mayor = service.devolverMayor();
                System.out.println("El número mayor es: " + mayor);
            }
            case 4 -> {
                double potencia = service.calcularPotencia();
                System.out.println("La potencia es: " + potencia);
            }
            case 5 -> {
                double raiz = service.calcularRaiz();
                System.out.println("La raíz es: " + raiz);
            }
            case 6 -> System.out.println("Adiós!");
            default -> System.out.println("Opción inválida.");
        }
    }
}
