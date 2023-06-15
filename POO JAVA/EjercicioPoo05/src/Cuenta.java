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
    public long getdni() {
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

    public void crearCuenta(){
        System.out.print("Ingresar numero de cuenta: ");
        numCuenta = tecla.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        dni = tecla.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        saldoActual = tecla.nextInt();
    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    public void extractRapida() {
        double retiro = saldoActual * 0.2;
        retirar(retiro);
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    public void consultaSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    public void consultaDatos() {
        System.out.println("Numero de cuenta: " + numCuenta);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Saldo actual: " + saldoActual);
    }
}