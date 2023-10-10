package org.example.entity;

public class Residencia extends AlojamientoExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    // Constructor
    public Residencia(String nombre, String direccion, String localidad, String gerente,
                      boolean privado, double metrosCuadrados, int cantidadLimosinas,
                      int cantidadHabitaciones, boolean descuentoGremios, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados, cantidadLimosinas);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean tieneDescuentoGremios(){
        return isDescuentoGremios();
    }
}
