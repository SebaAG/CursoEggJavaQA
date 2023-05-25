import java.util.Random;
import java.util.Scanner;

public class BuscarNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar tamaño del vector:");
        int tam = teclado.nextInt();

        int[] vector = genVectorRandom(tam);

        System.out.println("Ingrese numero que quiera buscar:");
        int num = teclado.nextInt();

        buscarNum(vector, num);
    }

    public static int[] genVectorRandom(int tam) {
        Random random = new Random();
        int[] vector = new int[tam];

        for (int i = 0 ; i < tam ; i++) {
            vector[i] = random.nextInt(100);
        }
        return vector;
    }

    public static void buscarNum(int[] vector, int num) {
        boolean find = false;
        boolean repeat = false;
        int primer = -1;

        for (int i = 0 ; i < vector.length ; i++) {
            if (vector[i] == num) {
                if (!find) {
                    primer = i;
                    find = true;
                } else {
                    repeat = true;
                }
            }
        }

        if (find) {
            System.out.println("El numero " + num + " esta en la posicion: " +
                    primer + " del vector.");
            if (repeat) {
                System.out.println("Numero repetido en el vector");
            }
        } else {
            System.out.println("El numero " + num + " no esta en el vector");
        }
    }

}