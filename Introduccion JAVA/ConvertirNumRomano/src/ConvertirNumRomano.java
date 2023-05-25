import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConvertirNumRomano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 y 10:");
        int num = teclado.nextInt();

        String numRomano = convertirNumRomano(num);

        if (numRomano != null) {
            System.out.println("Su numero: " + num + " en numeros romanos seria: " + numRomano);
        } else {
            System.out.println("Ingreso un numero incorrecto.");
        }
    }


    public static String convertirNumRomano(int numero) {
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                return null;
        }
    }
}