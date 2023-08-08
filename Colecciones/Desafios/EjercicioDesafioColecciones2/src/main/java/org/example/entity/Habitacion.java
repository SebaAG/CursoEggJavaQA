package org.example.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Habitacion {

    private int numHabitacion;
    private String fechaOcupa;

    public Habitacion(int numero) {
        this.numHabitacion = numero;
    }

    @Override
    public String toString() {
        return "-------------------------" + '\n' +
                "numHabitacion: " + numHabitacion + '\n' +
                "fechaOcupa: " + fechaOcupa + '\n' +
                "-------------------------";
    }
}
