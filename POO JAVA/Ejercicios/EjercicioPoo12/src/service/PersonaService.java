package service;

import entidad.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonaService {
    private final Persona persona = new Persona();
    /**
     * Permite al usuario ingresar el nombre y la fecha de nacimiento de una persona.
     */
    public void crearPersona() {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Ingresar nombre: ");
        persona.setNombre(tecla.nextLine());
        System.out.println("Ingresar fecha de nacimiento (d/m/a): ");
        String fecha = tecla.next();
        LocalDate nacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("d/M/y"));
        persona.setNacimiento(nacimiento);
    }
    /**
     * Calcula la edad de la persona en años.
     *
     * @return la edad de la persona en años.
     */
    public int calcularEdad() {
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(persona.getNacimiento(), fechaHoy);
        return periodo.getYears();
    }
    /**
     * Comprueba si la edad actual de la persona es menor que la edad especificada.
     *
     * @param edad la edad a comparar
     * @return true si la edad actual es menor que la edad especificada, false de lo contrario
     */
    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }
    /**
     * Muestra por pantalla la información de la persona, incluyendo nombre, fecha de nacimiento y edad.
     */
    public void mostrarPersona() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = persona.getNacimiento().format(formatter);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaFormat);
        System.out.println("Edad: " + calcularEdad());
    }
}