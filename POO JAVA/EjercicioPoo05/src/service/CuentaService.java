package service;

import entidad.Cuenta;

import java.util.Scanner;

public class CuentaService {
    private static final Scanner tecla = new Scanner(System.in);
    private final Cuenta cuenta = new Cuenta();
    /**
     * Crea una nueva cuenta solicitando al usuario ingresar el número de cuenta, el número de DNI y el saldo actual.
     * Los valores ingresados se asignan a los atributos correspondientes de la instancia de Cuenta.
     * @return La cuenta creada.
     */
    public Cuenta crearCuenta() {
        System.out.println("Ingresar el numero de cuenta: ");
        cuenta.setNumCuenta(tecla.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        cuenta.setDni(tecla.nextLong());
        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(tecla.nextInt());

        return cuenta;
    }
    /**
     * Realiza un depósito en la cuenta sumando el monto ingresado al saldo actual de la cuenta.
     * @param ingreso El monto a depositar.
     * @return Un mensaje indicando el éxito del depósito y el saldo actualizado.
     */
    public String masPlata(int ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        return "Usted ha acreditado " + ingreso + "\nSu saldo actual es de: " + cuenta.getSaldoActual();
    }
    /**
     * Realiza un retiro de dinero de la cuenta restando el monto ingresado al saldo actual de la cuenta.
     * @param retiro El monto a retirar.
     * @return Un mensaje indicando el éxito del retiro y el saldo actualizado, o un mensaje de saldo insuficiente.
     */
    public String menosPlata(int retiro) {
        if (retiro < cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            return "Usted ha retirado " + retiro + "\nSu saldo actual es de: " + cuenta.getSaldoActual();
        } else {
            return "Saldo insuficiente para realizar la transacción";
        }
    }
    /**
     * Realiza una extracción rápida de dinero de la cuenta, donde el monto máximo de retiro es el 20% del saldo actual.
     * @param retiro El monto a retirar.
     * @return Un mensaje indicando el éxito de la extracción rápida y el saldo actualizado, o un mensaje de monto máximo de retiro excedido.
     */
    public String plataRapida(int retiro){
        double limiteRetiro = cuenta.getSaldoActual() * 0.2;
        if (retiro <= limiteRetiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            return "Retiro rápido exitoso\nSu saldo actual es: " + cuenta.getSaldoActual();
        } else {
            return "No se puede realizar una extracción rápida. El monto máximo de retiro es " + limiteRetiro;
        }
    }
    /**
     * Consulta el saldo actual de la cuenta.
     * @return Un mensaje indicando el saldo actual de la cuenta.
     */
    public String consultarSaldo(){
        return "Su saldo actual es " + cuenta.getSaldoActual();
    }
    /**
     * Consulta los datos de la cuenta, incluyendo el número de cuenta, el número de DNI y el saldo actual.
     * @return Un mensaje con los datos de la cuenta.
     */
    public String consultarDatos() {
        return "---Datos Personales---\nNumero de cuenta: " + cuenta.getNumCuenta()
                + "\nDNI: " + cuenta.getDni()
                + "\nSaldo actual es " + cuenta.getSaldoActual();
    }
}