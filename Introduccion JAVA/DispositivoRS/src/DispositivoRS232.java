import java.util.Scanner;

public class DispositivoRS232 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        System.out.println("Ingrese las cadenas (&&&&& para finalizar):");
        String cadena = teclado.nextLine();
        String cadenas = cadena.toUpperCase();
        while (!cadenas.equals("&&&&&")) {
            if (cadenas.length() == 5 && cadenas.charAt(0) == 'X' && cadenas.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }

            cadena = teclado.nextLine();
            cadenas = cadena.toUpperCase();
        }

        System.out.println("Fin del proceso");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
}
