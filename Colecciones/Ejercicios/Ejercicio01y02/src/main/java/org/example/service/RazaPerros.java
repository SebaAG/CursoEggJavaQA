package org.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaPerros {

    private final ArrayList<String> razasPerros = new ArrayList<>();
    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 4);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. INGRESAR RAZA
                2. MOSTRAR LISTA
                3. ELIMINAR PERRO
                4. SALIR""");

        System.out.println();
    }

    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> ingresarRaza();
            case 2 -> mostrarLista();
            case 3 -> eliminarPerro();
            case 4 -> System.out.println("Adiós!");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void ingresarRaza() {
        boolean seguirIngresando = true;
        do {
            System.out.println("Ingresar nombre de la raza del perro (o escriba 'atras' para volver al menú): ");
            String raza = tecla.next();
            if (raza.equalsIgnoreCase("atras")) {
                seguirIngresando = false;
            } else {
                razasPerros.add(raza);
                System.out.println("Raza de perro '" + raza + "' guardada correctamente!");
            }
        } while (seguirIngresando);
    }

    private void mostrarLista() {
        if (razasPerros.isEmpty()) {
            System.out.println("La lista de razas de perros está vacía.");
        } else {
            System.out.println("\nLista de razas de perros:");
            for (String raza : razasPerros) {
                System.out.println(raza);
            }
        }
    }

    private void eliminarPerro() {
        if (razasPerros.isEmpty()) {
            System.out.println("La lista de razas de perros está vacía. No hay perros para eliminar.");
        } else {
            System.out.println("Ingrese el nombre del perro que desea eliminar: ");
            String perroEliminar = tecla.next();
            Iterator<String> iterator = razasPerros.iterator();
            boolean encontrado = false;
            while (iterator.hasNext()) {
                String raza = iterator.next();
                if (raza.equalsIgnoreCase(perroEliminar)) {
                    iterator.remove();
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Perro '" + perroEliminar + "' eliminado correctamente.");
            } else {
                System.out.println("El perro '" + perroEliminar + "' no se encuentra en la lista.");
            }
        }
    }
}