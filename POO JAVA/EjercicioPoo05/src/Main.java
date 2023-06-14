public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        cuenta.ingresar(1000);
        cuenta.retirar(500);
        cuenta.extractRapida();
        cuenta.consultaSaldo();
        cuenta.consultaDatos();
    }
}