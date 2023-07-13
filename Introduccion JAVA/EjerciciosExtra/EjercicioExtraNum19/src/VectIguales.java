import java.util.Scanner;

public class VectIguales {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese tamaño de los vectores: ");
        int tam = tecla.nextInt();
        
        int[] vect1 = new int[tam];
        int[] vect2 = new int[tam];

        System.out.println("Ingrese elementos del primer vector: ");

        for (int i = 0; i < tam; i++) {
            vect1[i] = tecla.nextInt();
        }

        System.out.println("Ingrese elementos del segundo vector: ");

        for (int i = 0; i < tam; i++) {
            vect2[i] = tecla.nextInt();
        }

        boolean esIgual = vectoresIguales(vect1, vect2);

        if (esIgual) {
            System.out.println("Los vectores son iguales!");
        } else {
            System.out.println("Los vectores no son iguales!");
        }
    }

    private static boolean vectoresIguales(int[] vect1, int[] vect2) {
        if (vect1.length != vect2.length) {
            return false;
        }
        for (int i = 0; i < vect1.length; i++) {
            if (vect1[i] != vect2[i]) {
                return false;
            }
        }
        return true;
    }

}