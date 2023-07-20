package org.example.service;

import java.util.*;

public class PaisService {

    private Set<String> paises = new HashSet<>();
    private Scanner tecla = new Scanner(System.in);

    public void cargarPaises() {
        boolean conti = true;
        while (conti) {
            System.out.println("Ingrese un país: ");
            String pais = tecla.nextLine();
            paises.add(pais);

            System.out.println("Desea guardar otro país? (S/N): ");
            String resp = tecla.nextLine();
            if (resp.equalsIgnoreCase("N")) {
                conti = false;
            }
        }
    }

    public void mostrarPaises() {
        System.out.println("***** PAÍSES GUARDADOS *****");
        System.out.println();
        for (String pais : paises) {
            System.out.println(pais);
        }
        System.out.println("----------------------------");
    }

    public void mostrarPaisesOrdenados() {
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println();
        System.out.println("***** PAÍSES ORDENADOS ALFABÉTICAMENTE *****");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
        System.out.println("----------------------------");
    }

    public void eliminarPais() {
        System.out.println("Ingrese el país que desea eliminar: ");
        String paisEliminar = tecla.nextLine();

        Iterator<String> iterator = paises.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String pais = iterator.next();
            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("País eliminado correctamente.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }
}
