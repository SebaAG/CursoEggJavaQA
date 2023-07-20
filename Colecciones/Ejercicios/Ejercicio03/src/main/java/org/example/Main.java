package org.example;

import org.example.service.AlumnoService;

public class Main {
    public static void main(String[] args) {
        AlumnoService service = new AlumnoService();
        service.crearAlumno();
        service.calcularNota();
    }
}