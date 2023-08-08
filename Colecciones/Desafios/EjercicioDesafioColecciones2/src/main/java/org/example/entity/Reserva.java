package org.example.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Reserva {

    private int id;
    private int numHabitacion;
    private int cantPersonas;
    private String fecha;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "id: " + id + '\n' +
                "numHabitacion: " + numHabitacion + '\n' +
                "cantPersonas: " + cantPersonas + '\n' +
                "fecha: " + fecha + '\n' +
                "-------------------------";
    }
}
