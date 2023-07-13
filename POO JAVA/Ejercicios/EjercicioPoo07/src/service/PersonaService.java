package service;

import entidad.Persona;

import java.util.Scanner;

public class PersonaService {
    private final static Scanner tecla = new Scanner(System.in);
    private final Persona person = new Persona();
    /**
     * Crea una nueva persona solicitando al usuario que ingrese su nombre, edad, sexo, peso y altura.
     */
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
    /**
     * Calcula el índice de masa corporal (IMC) de la persona y devuelve el resultado.
     * @return -1 si el IMC es menor a 20 (bajo peso), 0 si el IMC está entre 20 y 25 (peso ideal),
     *         1 si el IMC es mayor a 25 (sobrepeso).
     */
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
    /**
     * Verifica si la persona es mayor de edad.
     * @return true si la persona es mayor de edad, false en caso contrario.
     */
    public boolean esMayor() {
        return person.getEdad() >= 18;
    }
}