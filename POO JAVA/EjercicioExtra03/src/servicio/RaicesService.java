package servicio;

import entidad.Raices;

public class RaicesService {
    private final Raices raices;

    public RaicesService(Raices r) {
        this.raices = r;
    }

    public double getDiscriminante() {
        return Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC());
    }

    public boolean tieneRaices() {
        double discr = getDiscriminante();
        return discr >= 0;
    }

    public boolean tieneRaiz() {
        double discr = getDiscriminante();
        return discr == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-raices.getB() + Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            System.out.println("Raices: ");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("No existen raices reales!!");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("Raiz unica: ");
            System.out.println("x: " + x);
        } else {
            System.out.println("No existe raiz unica!!");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen soluciones reales!!");
        }
    }
}