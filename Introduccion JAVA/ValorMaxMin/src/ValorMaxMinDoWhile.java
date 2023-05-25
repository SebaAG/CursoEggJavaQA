import java.util.Scanner;

public class ValorMaxMinDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de numeros:");
        int n = teclado.nextInt();
        int cont = 1;
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;

        do {
            System.out.println("Ingrese numero " + cont + ":");
            num = teclado.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            cont++;
        } while (cont <= n);

        double prom = (double) suma / n;

        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Promedio: " + prom);
    }
}
