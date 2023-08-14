package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptar(Perro perro) {
        if (this.perro == null) {
            this.perro = perro;
        }
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido + '\n' +
                "Edad: " + edad + '\n' +
                "Documento: " + documento);
        if (perro != null) {
            System.out.println("***** PERRO *****");
            System.out.println("Nombre: " + perro.getNombre() + '\n' +
                    "Raza: " + perro.getRaza() + '\n' +
                    "Edad: " + perro.getEdad() + '\n' +
                    "Tamaño: " + perro.getTamaño());
        } else {
            System.out.println("*** NO TIENE PERRITOU ***");
        }
    }
}
