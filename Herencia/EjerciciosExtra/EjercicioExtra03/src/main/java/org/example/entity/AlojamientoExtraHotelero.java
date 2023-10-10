package org.example.entity;

import org.example.interfaces.Alojamiento;
import org.example.interfaces.Limosinas;

public abstract class AlojamientoExtraHotelero implements Alojamiento, Limosinas {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;
    private boolean privado;
    private double metrosCuadrados;
    private int cantidadLimosinas;

    // Constructor
    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente,
                                    boolean privado, double metrosCuadrados, int cantidadLimosinas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    // Implementación del método calcularPrecioHabitacion (para alojamientos extrahoteleros, se usa un valor fijo)
    @Override
    public double calcularPrecioHabitacion() {
        return 100; // Precio fijo para alojamientos extrahoteleros
    }
}
