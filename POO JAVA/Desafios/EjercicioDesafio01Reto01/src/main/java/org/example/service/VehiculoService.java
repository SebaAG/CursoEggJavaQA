package org.example.service;

import org.example.entidad.Vehiculo;

public class VehiculoService {

    public void moverse(Vehiculo vehiculo, int tiempo) {
        double distancia = vehiculo.getVeloc() * tiempo;
        System.out.println("El vehiculo " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                " se movio " + distancia + " metros en " + tiempo + " segundos");
    }

    public void frenar(Vehiculo vehiculo) {
        if (vehiculo.getTipo().equalsIgnoreCase("bicicleta")) {
            System.out.println("La bicicleta " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                    " se frenó y no avanzó más.");
        } else {
            double distanciaFrenado = vehiculo.getVeloc() * 2;
            System.out.println("El vehiculo " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                    " se frenó y no avanzó más de " + distanciaFrenado + " metros antes de detenerse.");
        }
    }

    public double calcularDistanciaRecorrida(Vehiculo vehiculo, int tiempo) {
        return vehiculo.getVeloc() * tiempo;
    }
}
