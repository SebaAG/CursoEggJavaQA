import java.util.Scanner;

public class MultiploCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantNum = 0;
        int cantPar = 0;
        int cantImp = 0;

        while (true) {
            System.out.println("Ingrese un numero entero (0 para finalizar) :");
            int num = teclado.nextInt();

            if (num == 0) {
                break;
            }
            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            cantNum++;

            if (num % 2 == 0) {
                cantPar++;
            } else {
                cantImp++;
            }
        }
        System.out.println("Cantidad de lecturas de numero: " + cantNum);
        System.out.print("Cantidad de numeros pares: " + cantPar);
        System.out.print("Cantidad de numerso impares: " + cantImp);
    }
}