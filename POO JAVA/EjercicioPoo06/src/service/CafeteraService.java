package service;

import entidad.Cafetera;

public class CafeteraService {
    private final Cafetera cafe = new Cafetera();

    public void servirCafe(int taza) {
        if (cafe.getCantActual() > 0) {
            if (taza <= cafe.getCantActual()) {
                cafe.setCantActual(cafe.getCantActual() - taza);
                System.out.println("Se ha servido una taza de café.");
            } else {
                System.out.println("No se puede servir el café, la cantidad solicitada excede la cantidad disponible " +
                        "en la cafetera.");
            }
        } else {
            System.out.println("No se puede servir el café, no hay suficiente cantidad en la cafetera.");
        }
    }

    public void vaciarCafetera() {
        cafe.setCantActual(0);
        System.out.println("La cafetera se ha vaciado.");
    }

    public void agregarCafe(int cantidad) {
        int total = cafe.getCantActual() + cantidad;
        if (total > cafe.getCapMaxima()) {
            cafe.setCantActual(cafe.getCapMaxima());
            System.out.println("Se ha llenado la cafetera con la cantidad máxima de café.");
        } else {
            cafe.setCantActual(total);
            System.out.println("Se ha agregado café a la cafetera.");
        }
    }
}
