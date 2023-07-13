import java.util.Scanner;

public class EdadMediaHijos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de familias:");
        int fam = teclado.nextInt();
        int totalSon = 0;
        int totalAge = 0;

        for (int i = 1; i <= fam; i++) {
            System.out.println("Ingrese cantidad de hijos:");
            int son = teclado.nextInt();

            for (int j =1; j <= son; j++) {
                System.out.println("Ingrese edad de los hijos:");
                int edad = teclado.nextInt();
                totalAge += edad;
                totalSon++;
            }
        }
        double media = (double) totalAge / totalSon;
        System.out.println("La medad de edad es: " + media);

    }
}