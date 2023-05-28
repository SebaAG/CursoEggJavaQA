import java.util.Random;

public class MatrizSuma {
    public static void main(String[] args) {
        int f = 3;
        int c = 4;
        int[][] mtz = new int[f][c];

        rellenarMtz(mtz);

        System.out.println("Matriz generada: ");
        mostrarMtz(mtz);

        int suma = calcSuma(mtz);

        System.out.println("Suma de los elementos: " + suma);
    }

    private static void rellenarMtz(int[][] mtz) {
        Random random = new Random();
        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                mtz[i][j] = random.nextInt(100);
            }
        }
    }

    private static void mostrarMtz(int[][] mtz) {
        for (int i = 0; i < mtz.length; i++){
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.print(mtz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int calcSuma(int[][] mtz) {
        int suma = 0;
        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                suma += mtz[i][j];
            }
        }
        return suma;
    }
}