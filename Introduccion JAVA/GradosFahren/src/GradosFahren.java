
import java.util.Scanner;

public class GradosFahren {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese temperatura en centigrados:");
        int cent = teclado.nextInt();

        int fah = 32 + (9 * cent/5);

        System.out.println("La temperatura ingresada convertida en Fahrenheit es: " + fah);
    }
}