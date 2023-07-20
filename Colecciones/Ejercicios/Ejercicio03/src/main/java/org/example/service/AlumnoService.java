package org.example.service;

import org.example.entidad.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    private final List<Alumno> listaAlumnos = new ArrayList<>();
    private static final Scanner tecla = new Scanner(System.in);

    public void crearAlumno() {
        boolean add = true;
        while (add) {
            System.out.println("Ingresar nombre del alumno: ");
            String nombre = tecla.next();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                int nota;
                do {
                    System.out.println("Ingresar la nota " + i + " del alumno (debe ser entre 1 y 10): ");
                    nota = tecla.nextInt();
                    if (nota < 1 || nota > 10) {
                        System.out.println("Nota inválida. Debe estar entre 1 y 10.");
                    }
                } while (nota < 1 || nota > 10);
                notas.add(nota);
            }
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);
            System.out.println("Agregar otro alumno? (S/N): ");
            String resp = tecla.next();
            add = resp.equalsIgnoreCase("s");
        }
    }

    public double notaFinal(String nombAlumn) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombAlumn)) {
                List<Integer> notas = alumno.getNota();
                double suma = 0;
                for (Integer nota : notas) {
                    suma += nota;
                }
                return suma / notas.size();
            }
        }
        return -1; // Si no se encuentra el alumno se retorna -1
    }

    public void calcularNota() {
        String resp;
        do {
            tecla.nextLine();
            System.out.println("Ingrese nombre del alumno: ");
            String nombAlumn = tecla.next();
            double notaFinal = notaFinal(nombAlumn);
            if (notaFinal >= 0) {
                System.out.println("La nota final de " + nombAlumn + " es " + notaFinal);
            } else {
                System.out.println("El alumno " + nombAlumn + " no está en la lista");
            }
            System.out.println("¿Desea buscar la nota de otro alumno? (S/N): ");
            resp = tecla.next();
        } while (resp.equalsIgnoreCase("s"));
    }
}
