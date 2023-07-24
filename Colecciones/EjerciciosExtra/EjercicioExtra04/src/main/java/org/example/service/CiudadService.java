package org.example.service;

import org.example.entidad.Ciudad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadService {

    private Map<String, Ciudad> ciudades = new HashMap<>();
    private Scanner tecla = new Scanner(System.in);

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.put(ciudad.getZip(), ciudad);
    }

    public Ciudad buscarCiudad(String zip) {
        return ciudades.get(zip);
    }

    public void eliminarCiudad(String zip) {
        ciudades.remove(zip);
    }

    public void mostrarCiudades() {
        for (Ciudad ciudad : ciudades.values()) {
            System.out.println(ciudad);
        }
    }
}
