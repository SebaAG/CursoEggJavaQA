import java.util.Scanner;

public class MultiRandom {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = generarNumRandom();
        int num2 = generarNumRandom();
        int result = num1 * num2;
        int resp;

        do {
            System.out.println("Adivina el resultado entre " + num1 + " * " + num2 + " :");
            resp = teclado.nextInt();

            if (resp == result) {
                System.out.println("Eso es correcto!!!");
                break;
            } else {
                System.out.println("Es incorrecto, intenta denuevo.");
            }
        } while (true);
    }

    private static int generarNumRandom() {
        return (int) (Math.random() * 11);
    }
}