import java.util.Scanner;

public class Cuenta {
    Scanner tecla = new Scanner(System.in);
    private int numCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long dni, int saldoActual){
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();

        System.out.println("Ingresar el numero de cuenta: ");
        cuenta.setNumCuenta(tecla.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        cuenta.setDni(tecla.nextLong());
        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(tecla.nextInt());

        return cuenta;
    }

    public void masPlata(double ingreso) {
        this.setSaldoActual(this.getSaldoActual() + (int) ingreso);
        System.out.println("Usted ha acreditado " + ingreso);
        System.out.println("Su saldo actual es de: " + this.getSaldoActual());
    }

    public void menosPlata(double retiro) {
        if (retiro < this.getSaldoActual()) {
            this.setSaldoActual(this.getSaldoActual() - (int) retiro);
            System.out.println("Usted a retirado " + retiro);
            System.out.println("Su saldo actual es de: " + this.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente para realizar la transacción");
        }
    }

    public void plataRapida(double retiro){
        if (retiro <= (getSaldoActual() * 0.2)){
            this.setSaldoActual(this.getSaldoActual() - (int) retiro);
            System.out.println("Retiro rapido exitoso");
            System.out.println("Su saldo actual es: " + this.getSaldoActual());
        } else {
            System.out.println("No se puede realizar una extracción rápida");
            System.out.println(retiro + " es mayor al 20% de saldo actual en su cuenta");
        }
    }

    public String consultarSaldo(){
        return "Su saldo actual es " + this.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("---Datos Personales---");
        System.out.println("Numero de cuenta: " + this.getNumCuenta());
        System.out.println("DNI: " + this.getDni());
        System.out.println("Saldo actual es " + this.getSaldoActual());
    }

    public void ejecutarMenu() {
        Cuenta cuenta = crearCuenta();
        int opcion;

        System.out.println("""
                1.Consultar el saldo en la cuenta
                2.Depositar dinero
                3.Retirar dinero
                4.Extracción rápida
                5.Consultar Datos
                6.Salir""");
        System.out.println("Ingrese una opción");

        do {
            opcion = tecla.nextInt();

            switch (opcion) {
                case 1 -> System.out.println(cuenta.consultarSaldo());
                case 2 -> {
                    System.out.println("Ingrese una cantidad de dinero a ingresar");
                    cuenta.masPlata(tecla.nextDouble());
                }
                case 3 -> {
                    System.out.println("Ingrese una cantidad a retirar de dinero");
                    cuenta.menosPlata(tecla.nextDouble());
                }
                case 4 -> {
                    System.out.println("Ingrese la cantidad de dinero a retirar");
                    cuenta.plataRapida(tecla.nextDouble());
                }
                case 5 -> cuenta.consultarDatos();
                case 6 -> System.out.println("Adios!");
                default -> System.out.println("Ingrese una opción correcta");
            }
        } while (opcion != 6);
    }
}