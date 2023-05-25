import java.util.Scanner;

public class RangoFrase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String palabra = teclado.nextLine();
        int length = palabra.length();
        if (length == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}