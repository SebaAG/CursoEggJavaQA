package service;

public class PersonaProcesService {
    private final PersonaService[] personas;
    private final int[] imcPersonas;
    private final boolean[] esMayorEdad;
    /**
     * Constructor de la clase. Inicializa los arrays de personas, índices de IMC y banderas de mayor edad.
     */
    public PersonaProcesService() {
        personas = new PersonaService[4];
        imcPersonas = new int[4];
        esMayorEdad = new boolean[4];
    }
    /**
     * Crea las personas solicitando al usuario que ingrese los datos de cada una.
     */
    public void crearPersonas() {
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new PersonaService();
            personas[i].crearPersona();
            imcPersonas[i] = personas[i].calcularIMC();
            esMayorEdad[i] = personas[i].esMayor();
        }
    }
    /**
     * Calcula el porcentaje de personas con peso ideal.
     * @return El porcentaje de personas con peso ideal.
     */
    public double porcentajePesoIdeal() {
        return calcPorcentaje(imcPersonas, 0);
    }
    /**
     * Calcula el porcentaje de personas por debajo de su peso ideal.
     * @return El porcentaje de personas por debajo de su peso ideal.
     */
    public double porcentajeBajoPeso() {
        return calcPorcentaje(imcPersonas, -1);
    }
    /**
     * Calcula el porcentaje de personas con sobrepeso.
     * @return El porcentaje de personas con sobrepeso.
     */
    public double porcentajeSobrepeso() {
        return calcPorcentaje(imcPersonas, 1);
    }
    /**
     * Calcula el porcentaje de personas mayores de edad.
     * @return El porcentaje de personas mayores de edad.
     */
    public double porcentajeMayorEdad() {
        return calcPorcentaje(esMayorEdad, true);
    }
    /**
     * Calcula el porcentaje de personas menores de edad.
     * @return El porcentaje de personas menores de edad.
     */
    public double porcentajeMenorEdad() {
        return calcPorcentaje(esMayorEdad, false);
    }
    /**
     * Calcula el porcentaje de valores objetivo en el array dado.
     * @param valores El array de valores.
     * @param objetivo El valor objetivo a buscar en el array.
     * @return El porcentaje de valores objetivo encontrados en el array.
     */
    private double calcPorcentaje(int[] valores, int objetivo) {
        int cantObjetivo = 0;
        for (int valor : valores) {
            if (valor == objetivo) {
                cantObjetivo++;
            }
        }
        return (cantObjetivo / (double) valores.length) * 100;
    }
    /**
     * Calcula el porcentaje de valores objetivo en el array dado.
     * @param valores El array de valores.
     * @param objetivo El valor objetivo a buscar en el array.
     * @return El porcentaje de valores objetivo encontrados en el array.
     */
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