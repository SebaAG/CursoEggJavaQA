package service;

import entidad.Cadena;
import java.util.Scanner;

/**

 Esta clase proporciona un menú de opciones para interactuar con la clase CadenaService.
 */
public class MenuService {
    private final Cadena cadena = new Cadena();
    private final CadenaService service;
    private static final Scanner tecla = new Scanner(System.in);

    /**

     Constructor de la clase MenuService.
     Inicializa un objeto de la clase CadenaService.
     */
    public MenuService() {
        this.service = new CadenaService(cadena);
    }
    /**

     Ejecuta el menú de la aplicación y realiza las operaciones seleccionadas.
     */
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 8);
    }
    /**

     Muestra el menú de opciones en pantalla.
     */
     private static void showMenu() {
     System.out.println("""
             ** MENU ***
             1. INGRESAR FRASE
             2. MOSTRAR VOCALES
             3. INVERTIR FRASE
             4. CANTIDAD DE VECES QUE SE REPITE EL CARACTER EN LA FRASE
             5. INGRESAR OTRA FRASE PARA COMPARAR LONGITUD
             6. UNIR FRASES
             7. REEMPLAZAR LA LETRA 'A' DE LA PRIMERA FRASE
             8. SALIR""");
     }
     /**

     Obtiene la opción seleccionada por el usuario.
     @return El número de la opción seleccionada.
     */
    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }
    /**

     Ejecuta la opción seleccionada por el usuario.
     @param opc El número de la opción seleccionada.
     */
    private void ejectOpc(int opc) {
        switch (opc) {
            case 1:
                tecla.nextLine(); // Limpiar el búfer del scanner
                System.out.print("Ingresar una frase: ");
                String frase = tecla.nextLine();
                cadena.setFrase(frase);
                break;
            case 2:
                service.mostrarVocales();
                break;
            case 3:
                service.invertirFrase();
                break;
            case 4:
                tecla.nextLine(); // Limpiar el búfer del scanner
                System.out.print("Ingresar letra para ver cuántas veces se repite: ");
                String letra = tecla.nextLine();
                service.vecesRepetido(letra);
                break;
            case 5:
                tecla.nextLine(); // Limpiar el búfer del scanner
                System.out.print("Ingrese una segunda frase para comparar longitud: ");
                String frase2 = tecla.nextLine();
                service.compararLong(frase2);
                break;
            case 6:
                tecla.nextLine(); // Limpiar el búfer del scanner
                System.out.print("Ingrese otra frase para unirlas: ");
                frase2 = tecla.nextLine();
                service.unirFrase(frase2);
                break;
            case 7:
                tecla.nextLine(); // Limpiar el búfer del scanner
                System.out.print("Ingrese una letra que reemplace las 'a': ");
                letra = tecla.nextLine();
                service.reemplazar(letra);
                break;
            case 8:
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}