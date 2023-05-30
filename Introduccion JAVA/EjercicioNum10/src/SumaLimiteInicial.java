import java.util.Scanner;

public class SumaLimiteInicial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial:");
        int limite = teclado.nextInt();
        int suma = 0;

        while (suma <= limite) {
            System.out.println("Ingrese numero/s:");
            int num = teclado.nextInt();
            suma += num;
            if (suma > limite) {
                break;
            }
        }

        System.out.println("El limite " + limite + " fue superado");
        System.out.println("La suma total de los numeros ingresados es: " + suma);

    }
}