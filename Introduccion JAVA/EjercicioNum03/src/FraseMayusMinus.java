import java.util.Scanner;


public class FraseMayusMinus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = teclado.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();

        System.out.println("Su frase ingresada convertida a mayusculas: " + mayus);
        System.out.println("Su frase ingresada convertida a minusculas: " + minus);
    }
}