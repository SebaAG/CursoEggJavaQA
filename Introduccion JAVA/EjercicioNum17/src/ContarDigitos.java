import java.util.Random;

public class ContarDigitos {
    public static void main(String[] args) {
        int tam = 10;
        int[] vect = new int[tam];

        rellenarVector(vect);
        imprimirVector(vect);
        contarDigitos(vect);
    }

    private static void rellenarVector(int[] vect) {
        Random random = new Random();

        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(10000);
        }
    }

    private static void imprimirVector(int[] vect) {
        for (int j : vect) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void contarDigitos(int[] vect) {
        int[] contador = new int[6];
        for (int num : vect) {
            int digitos = contarDigitosNum(num);
            if (digitos <= 5) {
                contador[digitos]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígitos: " + contador[i]);
        }
    }

    private static int contarDigitosNum(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
