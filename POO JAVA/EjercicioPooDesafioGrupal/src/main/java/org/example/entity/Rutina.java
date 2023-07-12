package org.example.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Rutina {
    private UUID id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    @Override
    public String toString() {
        return
                "ID: " + id + '\n' +
                "Nombre: " + nombre + '\n' +
                "Duración: " + duracion + " minutos" +  '\n' +
                "Nivel de Dificultad: " + nivelDificultad + '\n' +
                "Descripción: " + descripcion + '\n' +
                "-------------------------------------------";
    }
}