package org.example.service;

import org.example.entidad.CantanteFamoso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CantanteFamosoService {

    private final List<CantanteFamoso> cantanteFamosos = new ArrayList<>();
    private static final Scanner tecla = new Scanner(System.in);

    public void agregarCantante(String nombre, String discoMasVentas) {
        int maxCantante = 5;
        if (cantanteFamosos.size() >= maxCantante) {
            System.out.println("Ya se agregaron la cantidad maxima permitida!");
            return;
        }
        cantanteFamosos.add(new CantanteFamoso(nombre, discoMasVentas));
    }

    public void mostrarCantantes() {
        for (CantanteFamoso cantante : cantanteFamosos) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante() {
        System.out.println("Ingrese nombre del cantante ha eliminar: ");
        String nombre = tecla.nextLine();
        CantanteFamoso eliminar = null;
        for (CantanteFamoso cantante : cantanteFamosos) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                eliminar = cantante;
                break;
            }
        }
        if (eliminar != null) {
            cantanteFamosos.remove(eliminar);
            System.out.println("***** CANTANTE ELIMINADO *****");
        } else {
            System.out.println("***** CANTANTE NO ENCONTRADO *****");
        }
    }
}
