import java.util.Scanner;

public class CalcularDiasHoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos: ");
        int minutos = teclado.nextInt();
        int minutosDia = 24 * 60;
        int horas = (minutos % minutosDia) / 60;
        int dias = minutos / minutosDia;

        System.out.println("En " + minutos + " son: " + dias + " dias y " + horas + " horas.");

    }
}