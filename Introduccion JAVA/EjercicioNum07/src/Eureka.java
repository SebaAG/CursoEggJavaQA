import java.util.Scanner;

public class Eureka {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();

        System.out.println((palabra.equals("eureka")) ? "CORRECTO" : "INCORRECTO");

    }
}