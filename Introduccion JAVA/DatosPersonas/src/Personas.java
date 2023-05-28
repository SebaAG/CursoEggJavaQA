import java.util.Scanner;

public class Personas {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String continuar = "si";

        while (!continuar.equalsIgnoreCase("no")) {
            System.out.println("Nombre de la persona: ");
            String nombre = tecla.next();

            System.out.println("Edad de la persona: ");
            int edad = tecla.nextInt();

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }

            System.out.println("Seguir mostrando personas (si/no): ");
            continuar = tecla.next();
        }
    }
}