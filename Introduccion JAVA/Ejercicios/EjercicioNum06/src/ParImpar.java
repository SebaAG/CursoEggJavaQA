import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = teclado.nextInt();

        System.out.println((num % 2 == 0) ? "Su numero es par." : "Su numero es impar.");
    }
}