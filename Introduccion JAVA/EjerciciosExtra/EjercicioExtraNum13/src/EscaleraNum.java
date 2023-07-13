import java.util.Scanner;

public class EscaleraNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese altura de la escalera:");
        int alt = teclado.nextInt();

        for (int i = 1; i <= alt; i++) {
            for (int j = 1;j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}