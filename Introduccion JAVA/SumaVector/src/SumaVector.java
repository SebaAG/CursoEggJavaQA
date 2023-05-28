import java.util.Scanner;

public class SumaVector {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Tamaño del vector: ");
        int tam = tecla.nextInt();
        int[] vect = new int[tam];

        System.out.println("Ingresar elementos del vector: ");

        for (int i = 0; i < tam; i++){
            vect[i] = tecla.nextInt();
        }

        int suma = calcSumaVector(vect);

        System.out.println("La suma de los vectores es: " + suma);
    }

    private static int calcSumaVector(int[] vect) {
        int suma = 0;

        for (int i = 0; i < vect.length; i++) {
            suma += vect[i];
        }
        return suma;
    }
}