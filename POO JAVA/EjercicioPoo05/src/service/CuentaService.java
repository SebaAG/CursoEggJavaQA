package service;

import entidad.Cuenta;

import java.util.Scanner;

public class CuentaService {
    private static final Scanner tecla = new Scanner(System.in);
    private final Cuenta cuenta = new Cuenta();
    public Cuenta crearCuenta() {
        System.out.println("Ingresar el numero de cuenta: ");
        cuenta.setNumCuenta(tecla.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        cuenta.setDni(tecla.nextLong());
        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(tecla.nextInt());

        return cuenta;
    }

    public String masPlata(int ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        return "Usted ha acreditado " + ingreso + "\nSu saldo actual es de: " + cuenta.getSaldoActual();
    }

    public String menosPlata(int retiro) {
        if (retiro < cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            return "Usted ha retirado " + retiro + "\nSu saldo actual es de: " + cuenta.getSaldoActual();
        } else {
            return "Saldo insuficiente para realizar la transacción";
        }
    }

    public String plataRapida(int retiro){
        double limiteRetiro = cuenta.getSaldoActual() * 0.2;
        if (retiro <= limiteRetiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            return "Retiro rápido exitoso\nSu saldo actual es: " + cuenta.getSaldoActual();
        } else {
            return "No se puede realizar una extracción rápida. El monto máximo de retiro es " + limiteRetiro;
        }
    }

    public String consultarSaldo(){
        return "Su saldo actual es " + cuenta.getSaldoActual();
    }

    public String consultarDatos() {
        return "---Datos Personales---\nNumero de cuenta: " + cuenta.getNumCuenta()
                + "\nDNI: " + cuenta.getDni()
                + "\nSaldo actual es " + cuenta.getSaldoActual();
    }
}
