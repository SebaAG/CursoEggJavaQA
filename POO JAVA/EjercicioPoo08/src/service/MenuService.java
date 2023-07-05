package service;

import entidad.Cadena;

import java.util.Scanner;

public class MenuService {
    private final Cadena cadena = new Cadena();
    private CadenaService service = new CadenaService(cadena);
    private static final Scanner tecla = new Scanner(System.in);

    public MenuService() {
        this.service = new CadenaService(cadena);
    }
    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 8);
    }

    // SE MUESTRA EL MENU DE LA APP
    private static void showMenu() {
        System.out.println("*** MENU ***" + '\n' +
                "1. INGRESAR FRASE" + '\n' +
                "2. MOSTRAR VOCALES" + '\n' +
                "3. INVERTIR FRASE" + '\n' +
                "4. CANTIDAD DE VECES QUE SE REPITE EL CARACTER EN LA FRASE" + '\n' +
                "5. INGRESAR OTRA FRASE PARA COMPARAR LONGITUD" + '\n' +
                "6. UNIR FRASES" + '\n' +
                "7. REEMPLAZAR LA LETRA 'A' DE LA PRIMERA FRASE" + '\n' +
                "8. SALIR");
    }

    // SE INGRESA EL NUMERO DESEADO PARA CADA OPCION DEL MENU
    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    // SWITCH PARA EJECUTAR LA OPCIÓN SELECCIONADA
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