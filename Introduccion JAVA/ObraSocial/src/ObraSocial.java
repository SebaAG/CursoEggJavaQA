import java.util.Scanner;

public class ObraSocial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese que tipo de socio es (A,B,C):");
        char socio = teclado.next().toUpperCase().charAt(0);

        System.out.println("Ingrese el costo del tratamiento:");
        double cost = teclado.nextDouble();

        double aPagar = 0.0;

        if (socio == 'A') {
            aPagar = cost * 0.5;
        } else if (socio == 'B') {
            aPagar = cost * 0.65;
        } else if (socio == 'C') {
            aPagar = cost;
        } else {
            System.out.println("Ingreso una clase de socio invalida.");
            return;
        }

        System.out.println("Costo de tratamiento: " + aPagar);
    }
}