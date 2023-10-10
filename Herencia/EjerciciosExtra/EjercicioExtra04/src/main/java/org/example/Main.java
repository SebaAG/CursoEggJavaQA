package org.example;

import org.example.entity.Estudiante;
import org.example.entity.PersonalServicio;
import org.example.entity.Profesor;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Perez", "123456789", "Soltero", "Ingeniería Informática");
        Profesor profesor = new Profesor("Maria", "Gomez", "987654321", "Casado", 2010, "D101", "Matemáticas");
        PersonalServicio personalServicio = new PersonalServicio("Carlos", "Lopez", "456789123", "Soltero", 2015, "S202", "Biblioteca");

        System.out.println("Información del Estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nInformación del Profesor:");
        System.out.println(profesor.toString());

        System.out.println("\nInformación del Personal de Servicio:");
        System.out.println(personalServicio.toString());

        // Realizar operaciones
        estudiante.cambiarEstadoCivil("Casado");
        profesor.reasignarDespacho("D102");
        estudiante.matricularEnCurso("Ingeniería de Software");
        profesor.cambiarDepartamento("Física");
        personalServicio.trasladarSeccion("Decanato");

        // Imprimir información actualizada
        System.out.println("\nInformación actualizada del Estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nInformación actualizada del Profesor:");
        System.out.println(profesor.toString());

        System.out.println("\nInformación actualizada del Personal de Servicio:");
        System.out.println(personalServicio.toString());
    }
}