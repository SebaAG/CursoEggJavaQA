public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        int suma = operacion.sumar();
        System.out.println("Suma: " + suma);
        int resta = operacion.restar();
        System.out.println("Resta: " + resta);

        int multiplicacion = operacion.multiplicar();
        if (multiplicacion != 0) {
            System.out.println("Multiplicacion: " + multiplicacion);
        }

        int division = operacion.dividir();
        if (division != 0) {
            System.out.println("Division: " + division);
        }
    }
}