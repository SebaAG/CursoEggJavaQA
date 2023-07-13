package org.example.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cliente {
    private UUID id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    @Override
    public String toString() {
        return
                "ID: " + id + '\n' +
                "Nombre: " + nombre + '\n' +
                "Edad: " + edad + '\n' +
                "Altura: " + altura + " metros" + '\n' +
                "Peso: " + peso + " kg" + '\n' +
                "Objetivo: " + objetivo + '\n' +
                "-------------------------------------------";
    }
}
