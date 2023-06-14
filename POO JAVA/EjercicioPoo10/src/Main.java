import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] arrayA = new double[50];
        double[] arrayB = new double[20];
        Random random = new Random();

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextDouble() * 50;
        }

        System.out.println("Array A: ");
        System.out.println(Arrays.toString(arrayA));
        Arrays.sort(arrayA);
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        Arrays.fill(arrayB, 10, 20, 0.9);
        System.out.println("Array A ordenado: ");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Array B combinado: ");
        System.out.println(Arrays.toString(arrayB));
    }
}