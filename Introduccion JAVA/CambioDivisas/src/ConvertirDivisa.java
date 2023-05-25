import java.util.Scanner;

public class ConvertirDivisa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double euros = teclado.nextDouble();

        System.out.print("Ingrese la moneda a la que desea convertir (libras, dolares, yenes): ");
        String moneda = teclado.next();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double conver = 0;
        String nombreMoneda = "";

        switch (moneda.toLowerCase()) {
            case "libras":
                conver = euros * 0.86;
                nombreMoneda = "libras";
                break;
            case "dolares":
                conver = euros * 1.28611;
                nombreMoneda = "dolares";
                break;
            case "yenes":
                conver = euros * 129.852;
                nombreMoneda = "yenes";
                break;
            default:
                System.out.println("Moneda no valida, vuelva a intentar.");
                return;
        }
        double converRound = Math.round(conver * 100) / 100.0;
        String newConver = String.valueOf(converRound);

        System.out.println(euros + " euros equivalen a " + newConver + " " + nombreMoneda + ".");
    }
}
