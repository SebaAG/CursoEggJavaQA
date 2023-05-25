public class AntiSimetricaMtz {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, -2},
                {-1, 0, 3},
                {2, -3, 0}
        };

        boolean esAnti = checkAntiSimetria(matriz);

        if (esAnti) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz NO es anti simétrica.");
        }
    }

    public static boolean checkAntiSimetria(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;

        if (f != c) {
            return false;
        }

        int[][] trasp = obtenerTraspuesta(matriz);

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] != -trasp[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] obtenerTraspuesta(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;

        int[][] trasp = new int[c][f];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                trasp[j][i] = matriz[i][j];
            }
        }
        return trasp;
    }
}
