import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EsVocal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = teclado.nextLine();

        if (letra.length() == 1) {
            letra = letra.toLowerCase();

            if (letra.equals("a")|| letra.equals("e") || letra.equals("i") ||
                    letra.equals("o") || letra.equals("u")){
                System.out.println("La letra ingresada es una vocal");

            } else {
                System.out.println("La letra ingresada NO es una vocal");
            }
        } else {
            System.out.println("Ingresar solo UNA(1) letra");
        }
    }
}
