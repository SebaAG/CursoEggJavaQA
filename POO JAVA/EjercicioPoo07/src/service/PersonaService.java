package service;

import entidad.Persona;

import java.util.Scanner;

public class PersonaService {
    private final static Scanner tecla = new Scanner(System.in);
    private final Persona person = new Persona();

    public void crearPersona() {
        System.out.println("Ingrese nombre: ");
        person.setNombre(tecla.nextLine());
        System.out.println("Ingrese edad: ");
        person.setEdad(Integer.parseInt(tecla.nextLine()));
        System.out.println("Ingrese el sexo (H/M/O): ");
        person.setSexo(tecla.next().charAt(0));

        while (Character.toLowerCase(person.getSexo()) != 'h' && Character.toLowerCase(person.getSexo()) != 'm'
                && Character.toLowerCase(person.getSexo()) != 'o') {
            System.out.print("Sexo incorrecto, ingrese nuevamente (H/M/O): ");
            person.setSexo(Character.toLowerCase(tecla.next().charAt(0)));
        }

        System.out.println("Ingrese el peso: ");
        person.setPeso(tecla.nextDouble());
        tecla.nextLine(); // Agregar esta línea para consumir el carácter de nueva línea pendiente
        System.out.println("Ingrese la altura: ");
        person.setAltura(tecla.nextDouble());
        tecla.nextLine(); // Agregar esta línea para consumir el carácter de nueva línea pendiente
    }

    public int calcularIMC() {
        double imc = person.getPeso() / (person.getAltura() * person.getAltura());

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayor() {
        return person.getEdad() >= 18;
    }
}