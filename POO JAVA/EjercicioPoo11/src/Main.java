import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Ingresar el dia: ");
        int dia = tecla.nextInt();
        System.out.print("Ingresar el mes: ");
        int mes = tecla.nextInt();
        System.out.print("Ingresar el año: ");
        int anno = tecla.nextInt();

        LocalDate fecha = LocalDate.of(anno, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fecha, fechaActual);
        int difeAnno = periodo.getYears();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        String fechaDif = fecha.format(formatter);
        String fechaActualDif = fechaActual.format(formatter);

        System.out.println("Fecha ingresada por el usuario: " + fechaDif);
        System.out.println("Fecha actual: " + fechaActualDif);
        System.out.println("Los años que hay entre las fechas es: " + difeAnno);
    }
}