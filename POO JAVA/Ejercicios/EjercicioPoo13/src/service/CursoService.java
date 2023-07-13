package service;

import entidad.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CursoService {
    private final Curso curso = new Curso();
    private static final Scanner tecla = new Scanner(System.in);
    /**
     * Permite al usuario ingresar los nombres de los alumnos y cargarlos en el curso.
     */
    public void cargarAlumnos() {
        List<String> alumnos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            alumnos.add(tecla.nextLine());
        }
        String[] alumnosArray = new String[alumnos.size()];
        alumnosArray = alumnos.toArray(alumnosArray);
        curso.setAlumnos(alumnosArray);
    }
    /**
     * Permite al usuario crear un nuevo curso ingresando los datos correspondientes.
     */
    public void crearCurso() {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingresar nombre del curso: ");
        String nombreCurso = tecla.nextLine();
        System.out.print("Ingresar la cantidad de horas por día: ");
        int cantidadHorasPorDia = tecla.nextInt();
        System.out.print("Ingresar la cantidad de días por semana: ");
        int cantidadDiasPorSemana = tecla.nextInt();
        tecla.nextLine();
        System.out.print("Ingresar el turno (mañana/tarde): ");
        String turno = tecla.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = tecla.nextDouble();

        curso.setNombreCurso(nombreCurso);
        curso.setCantidadHorasPorDia(cantidadHorasPorDia);
        curso.setCantidadDiasPorSemana(cantidadDiasPorSemana);
        curso.setTurno(turno);
        curso.setPrecioPorHora(precioPorHora);

        cargarAlumnos();
    }
    /**
     * Calcula la ganancia semanal del curso.
     *
     * @return la ganancia semanal del curso
     */
    public double calcularGananciaSemanal() {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() *
                curso.getAlumnos().length * curso.getCantidadDiasPorSemana();
    }
}
