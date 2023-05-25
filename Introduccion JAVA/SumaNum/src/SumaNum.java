import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SumaNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a sumar:");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero a sumar:");
        int num2 = teclado.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma da un total de: " + suma);
    }
}