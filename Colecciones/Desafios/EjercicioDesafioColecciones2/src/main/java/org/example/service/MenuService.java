package org.example.service;

import java.util.Scanner;

public class MenuService {

    private static Scanner tecla = new Scanner(System.in);
    private HotelService hs = new HotelService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 9);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. CARGAR PERSONA
                2. LISTA DE PERSONAS
                3. CARGAR HABITACIÓN
                4. LISTA DE HABITACIONES
                5. CARGAR RESERVA
                6. LISTA DE RESERVA
                7. CREAR ALOJAMIENTO
                8. LISTA DE ALOJAMIENTOS
                9. SALIR""");

        System.out.println();
    }

    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> hs.crearPersona();
            case 2 -> hs.mostrarPersonas();
            case 3 -> hs.crearHabitacion();
            case 4 -> hs.mostrarHabitaciones();
            case 5 -> hs.crearReserva();
            case 6 -> hs.mostrarReservas();
            case 7 -> hs.crearAlojamiento();
            case 8 -> hs.mostrarAlojamientos();
            case 9 -> System.out.println("Adios!");
            default -> System.out.println("Opción inválida.");
        }
    }
}
