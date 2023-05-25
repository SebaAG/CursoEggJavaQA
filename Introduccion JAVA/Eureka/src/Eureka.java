import java.util.Scanner;

public class Eureka {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();
        if (palabra.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}