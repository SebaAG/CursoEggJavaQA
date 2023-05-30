import java.util.Random;

public class LlenarVector {
    public static void main(String[] args) {
        int tam = 5;
        int[] vect = new int[tam];

        rellenarVector(vect);
        imprimirVector(vect);
    }

    private static void rellenarVector(int[] vect) {
        Random random = new Random();

        for (int i = 0; i < vect.length; i++ ) {
            vect[i] = random.nextInt(100);
        }
    }

    private static void imprimirVector(int[] vect) {
        for (int j : vect) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}