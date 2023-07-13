import java.util.Scanner;

public class NumerosComp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = teclado.nextInt();
        int cantidad = calcularDigitos(num);

        System.out.println("La cantidad de digitos es: " + cantidad);
    }

    private static int calcularDigitos(int num) {
        if (num == 0){
            return 1;
        }
        int cant = 0;
        while (num != 0) {
            num = num / 10;
            cant++;
        }
        return cant;
    }
}