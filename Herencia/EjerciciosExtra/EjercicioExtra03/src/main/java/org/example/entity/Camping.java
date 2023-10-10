package org.example.entity;

public class Camping extends AlojamientoExtraHotelero {
    private int capacidadMaximaCarpa;
    private int cantidadBanos;
    private boolean tieneRestaurante;

    // Constructor
    public Camping(String nombre, String direccion, String localidad, String gerente,
                   boolean privado, double metrosCuadrados, int cantidadLimosinas,
                   int capacidadMaximaCarpa, int cantidadBanos, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados, cantidadLimosinas);
        this.capacidadMaximaCarpa = capacidadMaximaCarpa;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpa() {
        return capacidadMaximaCarpa;
    }

    public void setCapacidadMaximaCarpa(int capacidadMaximaCarpa) {
        this.capacidadMaximaCarpa = capacidadMaximaCarpa;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    public boolean tieneRestaurante(){
        return tieneRestaurante;
    }
}


