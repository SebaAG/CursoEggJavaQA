package org.example.entity;

public class HotelCuatroEstrellas extends Hotel {
    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente,
                                int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                                boolean gimnasio, String nombreRestaurante, int capacidadRestaurante,
                                int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos,
                gimnasio, nombreRestaurante, capacidadRestaurante, cantidadLimosinas);
    }
}