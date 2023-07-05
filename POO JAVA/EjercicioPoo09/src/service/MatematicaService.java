package service;

import entidad.Matematica;
import java.text.DecimalFormat;

public class MatematicaService {
    private final Matematica numero = new Matematica();

    public void agregarNumeros() {
        numero.setNum1(Math.random() * 10);
        numero.setNum2(Math.random() * 10);
    }

    public void mostrarNumerosGenerados() {
        System.out.println("Números generados:");
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        System.out.println("Número 1: " + decimalFormat.format(numero.getNum1()));
        System.out.println("Número 2: " + decimalFormat.format(numero.getNum2()));
    }

    public double devolverMayor() {
        return Math.round(Math.max(numero.getNum1(), numero.getNum2()));
    }

    public double calcularPotencia() {
        double may = devolverMayor();
        double men = (numero.getNum1() < numero.getNum2()) ? numero.getNum1() : numero.getNum2();
        may = Math.round(may);
        men = Math.round(men);
        return Math.round(Math.pow(may, men));
    }

    public double calcularRaiz() {
        double men = (numero.getNum1() > numero.getNum2()) ? numero.getNum1() : numero.getNum2();
        men = Math.abs(men);
        return Math.round(Math.sqrt(men));
    }
}
