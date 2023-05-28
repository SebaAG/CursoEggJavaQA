import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");
        int num = tecla.nextInt();
        boolean esPrimo = esNumeroPrimo(num);

        if (esPrimo) {
            System.out.println("Es un numero primo!");
        } else {
            System.out.println("No es un numero primo!");
        }
    }

    private static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}