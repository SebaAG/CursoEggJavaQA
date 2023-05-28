import java.util.Scanner;

public class RegistroNotas {
    public static void main(String[] args) {
        int cantAlumn = 10;
        double[] prom = new double[cantAlumn];

        cargarNotas(prom);

        int aprob = contarAprob(prom);
        int desaprob = cantAlumn - aprob;

        System.out.println("Cantidad de aprobados: " + aprob);
        System.out.println("Cantidad de desaprobados: " + desaprob);
    }

    private static void cargarNotas(double[] prom) {
        Scanner tecla = new Scanner(System.in);
        for (int i = 0; i < prom.length; i++) {
            System.out.println("Alumno #" + (i+1));
            System.out.println("Ingrese las notas: ");

            double nota1 = tecla.nextDouble();
            double nota2 = tecla.nextDouble();
            double nota3 = tecla.nextDouble();
            double nota4 = tecla.nextDouble();

            double promed = (nota1 * 0.1) + (nota2 * 0.15 + (nota3 * 0.25) + (nota4 * 0.5));
            prom[i] = promed;
        }
    }

    private static int contarAprob(double[] prom) {
        int contAprob = 0;
        for (int i = 0; i < prom.length; i++) {
            if (prom[i] >= 7) {
                contAprob++;
            }
        }
        return contAprob;
    }
}