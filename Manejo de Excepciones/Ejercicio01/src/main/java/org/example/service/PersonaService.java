package org.example.service;

import org.example.entity.Persona;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonaService {

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);

        Persona persona = new Persona();

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.next());
        System.out.print("Ingrese la edad: ");
        persona.setEdad(Integer.parseInt(scanner.next()));
        System.out.print("Ingrese el sexo (H/M/O): ");
        persona.setSexo(scanner.next().charAt(0));
        while (scanner.next().charAt(0) != 'H' && scanner.next().charAt(0) != 'M' && scanner.next().charAt(0) != 'O') {
            System.out.println("Sexo incorrecto. Debe ser H, M o O.");
            System.out.print("Ingrese el sexo (H/M/O): ");
            persona.setSexo(scanner.next().charAt(0));
        }
        System.out.print("Ingrese el peso en kg: ");
        persona.setPeso(Double.parseDouble(scanner.next()));
        System.out.print("Ingrese la altura en metros: ");
        persona.setAltura(Double.parseDouble(scanner.next()));
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}
