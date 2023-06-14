import java.util.Scanner;

public class FraseValidA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();
        String a = palabra.substring(0,1);
        if (a.equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}