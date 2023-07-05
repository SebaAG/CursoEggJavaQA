package service;

public class PersonaProcesService {
    private PersonaService[] personas;
    private int[] imcPersonas;
    private boolean[] esMayorEdad;

    public PersonaProcesService() {
        personas = new PersonaService[4];
        imcPersonas = new int[4];
        esMayorEdad = new boolean[4];
    }

    public void crearPersonas() {
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new PersonaService();
            personas[i].crearPersona();
            imcPersonas[i] = personas[i].calcularIMC();
            esMayorEdad[i] = personas[i].esMayor();
        }
    }

    public double porcentajePesoIdeal() {
        return calcPorcentaje(imcPersonas, 0);
    }

    public double porcentajeBajoPeso() {
        return calcPorcentaje(imcPersonas, -1);
    }

    public double porcentajeSobrepeso() {
        return calcPorcentaje(imcPersonas, 1);
    }

    public double porcentajeMayorEdad() {
        return calcPorcentaje(esMayorEdad, true);
    }

    public double porcentajeMenorEdad() {
        return calcPorcentaje(esMayorEdad, false);
    }

    private double calcPorcentaje(int[] valores, int objetivo) {
        int cantObjetivo = 0;
        for (int valor : valores) {
            if (valor == objetivo) {
                cantObjetivo++;
            }
        }
        return (cantObjetivo / (double) valores.length) * 100;
    }

    private double calcPorcentaje(boolean[] valores, boolean objetivo) {
        int cantObjetivo = 0;
        for (boolean valor : valores) {
            if (valor == objetivo) {
                cantObjetivo++;
            }
        }
        return (cantObjetivo / (double) valores.length) * 100;
    }
}
