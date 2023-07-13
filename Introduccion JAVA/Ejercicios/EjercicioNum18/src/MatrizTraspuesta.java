import java.util.Random;

public class MatrizTraspuesta {
    public static void main(String[] args) {
        int[][] matriz = genMatrizRandom(4, 4);
        
        System.out.println("Matriz principal:");
        showMatriz(matriz);

        int[][] trasp = matrizTrasp(matriz);

        System.out.println("Matriz traspuesta:");
        showMatriz(trasp);
    }

    private static int[][] matrizTrasp(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;

        int[][] trasp = new int[f][c];

        for (int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                trasp[j][i] = matriz[i][j];
            }
        }
        return trasp;
    }

    private static void showMatriz(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] genMatrizRandom(int f, int c) {
        Random random = new Random();
        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++){
                matriz[i][j] = random.nextInt(100);
            }
        }
        return matriz;
    }
}