import java.util.Scanner;

public class RecorrerVector {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector:");
        int tam = teclado.nextInt();
        int[] vector = new int[tam];

        System.out.println("Ingrese los elementos del vector:");

        for (int i = 0; i < tam; i++) {
            vector[i] = teclado.nextInt();
        }

        int[] contarDigit = new int[6];
        for (int i = 0; i < tam; i++) {
            int digit = contarDigit(vector[i]);
            if (digit >= 1 && digit <=5) {
                contarDigit[digit]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de numeros de " + i + " digitos: " + contarDigit[i]);
        }
    }

    public static int contarDigit(int num) {
        int digit = 0;
        if (num == 0) {
            digit = 1;
        } else {
            while (num != 0) {
                num /= 10;
                digit++;
            }
        }
        return digit ;
    }
}