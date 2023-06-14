import java.util.Scanner;

public class DobleTripleCuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero a saber el doble, triple y su raiz cuadrada:");
        int num = teclado.nextInt();
        int dob = num * 2;
        int trip = num * 3;
        double rc = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + dob + " el triple es: " + trip + " y su raiz cuadrada: " +
                rc);
    }
}