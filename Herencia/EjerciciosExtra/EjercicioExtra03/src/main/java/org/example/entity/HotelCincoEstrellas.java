package org.example.entity;

public class HotelCincoEstrellas extends Hotel {
    private int cantidadSalonesConferencia;
    private int cantidadSuites;

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente,
                               int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                               boolean gimnasio, String nombreRestaurante, int capacidadRestaurante,
                               int cantidadLimosinas, int cantidadSalonesConferencia, int cantidadSuites) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos,
                gimnasio, nombreRestaurante, capacidadRestaurante, cantidadLimosinas);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }
}
