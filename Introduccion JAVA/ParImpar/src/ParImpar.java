import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("Su numero es par.");
        } if (num % 2 == 1) {
            System.out.println("Su numero es impar.");
        }
    }
}