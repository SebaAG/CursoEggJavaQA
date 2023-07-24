package org.example.service;

import org.example.entidad.Ciudad;

import java.util.Scanner;

public class MenuService {

    private final Scanner tecla = new Scanner(System.in);
    private final CiudadService ciudadService = new CiudadService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 5);
    }

    private void showMenu() {
        System.out.println("""
                *** MENU ***
                1. AGREGAR CIUDAD
                2. BUSCAR CIUDAD POR CÓDIGO POSTAL
                3. MOSTRAR CIUDADES
                4. ELIMINAR CIUDAD
                5. SALIR""");

        System.out.println();
    }

    private int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> agregarCiudad();
            case 2 -> buscarCiudad();
            case 3 -> mostrarCiudades();
            case 4 -> eliminarCiudad();
            case 5 -> System.out.println("Adiós.");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void agregarCiudad() {
        tecla.nextLine();
        System.out.println("Ingrese el código postal (sin letra) de la ciudad: ");
        String zip = tecla.nextLine();
        System.out.println("Ingrese el nombre de la ciudad: ");
        String nombre = tecla.nextLine();
        Ciudad ciudad = new Ciudad(zip, nombre);
        ciudadService.agregarCiudad(ciudad);
    }

    private void buscarCiudad() {
        tecla.nextLine();
        System.out.println("Ingrese el código postal (sin letra) para buscar la ciudad: ");
        String zip = tecla.nextLine();
        Ciudad ciudad = ciudadService.buscarCiudad(zip);
        if (ciudad != null) {
            System.out.println("  ***** CIUDAD ENCONTRADA *****  ");
        } else {
            System.out.println("Ciudad no encontrada para el código postal " + zip);
        }
    }

    private void mostrarCiudades() {
        ciudadService.mostrarCiudades();
    }

    private void eliminarCiudad() {
        tecla.nextLine();
        System.out.println("Ingrese el código postal (sin letra) de la ciudad que desea eliminar: ");
        String zip = tecla.nextLine();
        ciudadService.eliminarCiudad(zip);
    }
}

