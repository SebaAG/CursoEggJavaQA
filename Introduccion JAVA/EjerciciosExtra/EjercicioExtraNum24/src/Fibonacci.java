import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros de la sucesion: ");
        int n = tecla.nextInt();

        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i= 2; i < n ; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("La sucesion de fibonacci con " + n + " numero es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}