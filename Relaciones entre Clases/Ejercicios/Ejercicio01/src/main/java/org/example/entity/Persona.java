package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro;

    public void adoptar(Perro perro) {
        this.perro = perro;
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
