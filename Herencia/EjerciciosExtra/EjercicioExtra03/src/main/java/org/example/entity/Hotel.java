package org.example.entity;

import org.example.interfaces.Alojamiento;

public abstract class Hotel implements Alojamiento {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadLimosinas;

    // Constructor
    public Hotel(String nombre, String direccion, String localidad, String gerente,
                 int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                 boolean gimnasio, String nombreRestaurante, int capacidadRestaurante,
                 int cantidadLimosinas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
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

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    // Implementación del método calcularPrecioHabitacion
    @Override
    public double calcularPrecioHabitacion() {
        double precioBase = 50;
        double valorRestaurante = calcularValorRestaurante();
        double valorGimnasio = calcularValorGimnasio();
        double valorLimosinas = cantidadLimosinas * 15;
        return precioBase + (cantidadHabitaciones * 1) + valorRestaurante + valorGimnasio + valorLimosinas;
    }

    // Métodos privados para calcular los valores agregados
    private double calcularValorRestaurante() {
        if (capacidadRestaurante < 30) {
            return 10;
        } else if (capacidadRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    private double calcularValorGimnasio() {
        return gimnasio ? 50 : 30;
    }
}
