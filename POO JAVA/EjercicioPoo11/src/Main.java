import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Ingresar el dia: ");
        int dia = tecla.nextInt();
        System.out.print("Ingresar el mes: ");
        int mes = tecla.nextInt() - 1;
        System.out.print("Ingresar el año: ");
        int anno = tecla.nextInt() - 1900;

        Date fecha = new Date(anno, mes, dia);
        Date fechaActual = new Date();

        long dife = fechaActual.getTime() - fecha.getTime();
        long difeAnno = dife / (1000L * 60 * 60 * 24 * 365);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy");
        String fechaDif = sdf.format(fecha);
        String fechaActualDif = sdf.format(fechaActual);

        System.out.println("Fecha ingresada por el usuario: " + fechaDif);
        System.out.println("Fecha actual: " + fechaActualDif);
        System.out.println("Los años que hay entre las fechas es: " + difeAnno);
    }
}