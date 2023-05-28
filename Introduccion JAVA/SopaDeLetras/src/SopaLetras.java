import java.util.Scanner;

public class SopaLetras {
    public static void main(String[] args) {
        int tam = 20;
        char[][] sopaLetras = new char[tam][tam];
        String[] palabras = leerPalabras();
        generarSopaLetras(sopaLetras, palabras);
        imprimirSopaLetras(sopaLetras);
    }

    private static String[] leerPalabras() {
        Scanner tecla = new Scanner(System.in);
        String[] palabras = new String[5];
        System.out.println("Ingrese 5 palabras de minimo 3 y maximo 5 caracteres: ");
        for (int i = 0; i < 5; i++) {
            palabras[i] = tecla.nextLine();
        }
        return palabras;
    }

    private static void generarSopaLetras(char[][] sopaLetras, String[] palabras) {
        int fSelec = (int) (Math.random() * sopaLetras.length);
        int cAct = 0;
        for (String palabra : palabras) {
            if (cAct + palabra.length() <= sopaLetras.length) {
                for (int i = 0; i < palabra.length(); i++) {
                    sopaLetras[fSelec][cAct + i] = palabra.charAt(i);
                }
                cAct += palabra.length() + 1;
            }
        }
        for (int i =0 ; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                if (sopaLetras[i][j] == '\u0000') {
                    sopaLetras[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
    }

    private static void imprimirSopaLetras(char[][] sopaLetras) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}