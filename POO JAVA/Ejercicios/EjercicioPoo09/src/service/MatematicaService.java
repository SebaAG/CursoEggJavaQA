package service;

import entidad.Matematica;
import java.text.DecimalFormat;

public class MatematicaService {
    private final Matematica numero = new Matematica();

    /**
     * Genera números aleatorios y los asigna a las propiedades num1 y num2 de la clase Matematica.
     */
    public void agregarNumeros() {
        numero.setNum1(Math.random() * 10);
        numero.setNum2(Math.random() * 10);
    }
    /**
     * Muestra en pantalla los números generados.
     */
    public void mostrarNumerosGenerados() {
        System.out.println("Números generados:");
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        System.out.println("Número 1: " + decimalFormat.format(numero.getNum1()));
        System.out.println("Número 2: " + decimalFormat.format(numero.getNum2()));
    }
    /**
     * Devuelve el mayor de los dos números generados.
     * @return El número mayor.
     */
    public double devolverMayor() {
        return Math.round(Math.max(numero.getNum1(), numero.getNum2()));
    }
    /**
     * Calcula la potencia del número mayor elevado al número menor.
     * @return El resultado de la potencia.
     */
    public double calcularPotencia() {
        double may = devolverMayor();
        double men = Math.min(numero.getNum1(), numero.getNum2());
        may = Math.round(may);
        men = Math.round(men);
        return Math.round(Math.pow(may, men));
    }
    /**
     * Calcula la raíz cuadrada del número mayor.
     * @return La raíz cuadrada del número mayor.
     */
    public double calcularRaiz() {
        double men = Math.max(numero.getNum1(), numero.getNum2());
        men = Math.abs(men);
        return Math.round(Math.sqrt(men));
    }
}