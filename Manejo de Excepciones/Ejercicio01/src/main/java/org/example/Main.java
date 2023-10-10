package org.example;

import org.example.entity.Persona;
import org.example.service.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService serv = new PersonaService();
        Persona personaNull = null;

        try {
            boolean mayorDeEdadNull = serv.esMayorDeEdad(personaNull);
            System.out.println("La persona es mayor de edad: " + mayorDeEdadNull);
        } catch (NullPointerException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        // Crear una persona con edad menor a 0 (lo cual es inválido)
        Persona personaInvalida = new Persona();
        personaInvalida.setNombre("Persona Invalida");
        personaInvalida.setEdad(-5); // Edad inválida

        try {
            boolean mayorDeEdadInvalida = serv.esMayorDeEdad(personaInvalida);
            System.out.println("La persona es mayor de edad: " + mayorDeEdadInvalida);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        // Crear una persona con sexo inválido
        try {
            Persona personaSexoInvalido = new Persona();
            personaSexoInvalido.setNombre("Persona Sexo Inválido");
            personaSexoInvalido.setEdad(25);
            personaSexoInvalido.setSexo('X'); // Sexo inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
