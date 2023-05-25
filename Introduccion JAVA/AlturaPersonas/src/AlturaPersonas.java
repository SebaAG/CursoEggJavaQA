import java.util.Scanner;

public class AlturaPersonas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas:");
        int person = teclado.nextInt();
        double suma = 0.0;
        int lowPers = 0;

        for (int i = 0; i < person; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + " :");
            double altura = teclado.nextDouble();

            suma += altura;


            if (altura < 1.60) {
                lowPers++;
            }
        }

        double promedio = suma / person;
        double promedioLow = (lowPers > 0) ? suma / lowPers : 0.0;

        System.out.println("Promedio estatura general: " + promedio);
        System.out.println("Promedio de estatura 1.60mts: " + promedioLow);
    }
}