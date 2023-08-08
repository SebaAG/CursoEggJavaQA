package org.example.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private String pais;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n' +
                "DNI: " + dni + '\n' +
                "pais: " + pais + '\n' +
                "-------------------------";
    }
}
