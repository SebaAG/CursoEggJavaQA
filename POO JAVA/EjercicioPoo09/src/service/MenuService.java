package service;

import java.util.Scanner;

/**
 * Clase que proporciona un menú de opciones para interactuar con la clase MatematicaService.
 */
public class MenuService {
    MatematicaService service = new MatematicaService();
    private static final Scanner tecla = new Scanner(System.in);

    /**
     * Ejecuta el menú de la aplicación y realiza las operaciones seleccionadas.
     */
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 6);
    }

    /**
     * Muestra el menú de opciones en pantalla.
     */
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

    /**
     * Obtiene la opción seleccionada por el usuario.
     *
     * @return El número de la opción seleccionada.
     */
    private static int obtOpc() {

        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    /**
     * Ejecuta la opción seleccionada por el usuario.
     *
     * @param opc El número de la opción seleccionada.
     */
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