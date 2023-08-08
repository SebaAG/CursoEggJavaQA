package org.example.service;

import org.example.entity.Alojamiento;
import org.example.entity.Habitacion;
import org.example.entity.Persona;
import org.example.entity.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelService {

    private List<Persona> personas = new ArrayList<>();
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Alojamiento> alojamientos = new ArrayList<>();
    int reservaIdCont = 1;
    private static Scanner tecla = new Scanner(System.in);

    public void crearPersona() {
        System.out.println("Nombre: ");
        String nombre = tecla.nextLine();
        System.out.println("Edad: ");
        int edad = tecla.nextInt();
        tecla.nextLine();
        System.out.println("DNI: ");
        String dni = tecla.nextLine();
        System.out.println("País: ");
        String pais = tecla.nextLine();

        personas.add(new Persona(nombre, edad, dni, pais));
        System.out.println("***** PERSONA CREADA *****");
    }

    public void mostrarPersonas() {
        System.out.println("***** LISTA DE PERSONAS *****");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("**********");
        }
    }

    public void crearHabitacion() {
        System.out.println("Número de habitación: ");
        int numero = tecla.nextInt();
        tecla.nextLine();
        habitaciones.add(new Habitacion(numero));
        System.out.println("***** HABITACIÓN CREADA *****");
    }

    public void mostrarHabitaciones() {
        System.out.println("***** LISTA DE HABITACIONES *****");
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
            System.out.println("**********");
        }
    }

    public void crearReserva() {
        System.out.println("***** NÚMERO DE HABITACIÓN (1-10) *****");
        int numHabitacion = tecla.nextInt();
        tecla.nextLine();
        if (numHabitacion < 1 || numHabitacion > 10) {
            System.out.println("***** NÚMERO DE HABITACIÓN INVÁLIDO *****");
            return;
        }
        Habitacion habitacion = null;
        for (Habitacion h : habitaciones) {
            if (h.getNumHabitacion() == numHabitacion) {
                habitacion = h;
                break;
            }
        }
        if (habitacion == null) {
            System.out.println("No se encontró la habitación.");
            return;
        }
        System.out.println("Cantidad de personas: ");
        int cantPersonas = tecla.nextInt();
        tecla.nextLine();
        System.out.println("Fechas (dd/MM/yyyy): ");
        String fechas = tecla.nextLine();
        if (cantPersonas > 3 && (numHabitacion >= 6 && numHabitacion <= 8)) {
            System.out.println("La cantidad de personas no es válida para esta habitación.");
            return;
        }
        if (cantPersonas > 1 && (numHabitacion >= 9 && numHabitacion <= 10)) {
            System.out.println("La cantidad de personas no es válida para esta habitación.");
            return;
        }
        reservas.add(new Reserva(reservaIdCont, numHabitacion, cantPersonas, fechas));
        habitacion.setFechaOcupa(fechas);
        System.out.println("Reserva creada exitosamente.");
        reservaIdCont++;
    }

    public void mostrarReservas() {
        System.out.println("***** LISTA DE RESERVA *****");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
            System.out.println("*********");
        }
    }

    public void crearAlojamiento() {
        System.out.print("ID de Reserva: ");
        int reservaId = tecla.nextInt();
        tecla.nextLine();  // Consumir nueva línea
        boolean reservaEncontrada = false;
        for (Reserva reserva : reservas) {
            if (reserva.getId() == reservaId) {
                alojamientos.add(new Alojamiento(reservaId));
                System.out.println("***** ALOJAMIENTO CREADO *****");
                reservaEncontrada = true;
                break;
            }
        }
        if (!reservaEncontrada) {
            System.out.println("No se encontró la reserva con el ID especificado.");
        }
    }

    public void mostrarAlojamientos() {
        System.out.println("***** LISTA DE ALOJAMIENTOS *****");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
            System.out.println("**********");
        }
    }
}
