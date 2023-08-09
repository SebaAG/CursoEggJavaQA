package org.example.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Reserva {

    private UUID id;
    private int numHabitacion;
    private int cantPersonas;
    private String fechaEntrada;
    private String fechaSalida;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "id: " + id + '\n' +
                "numHabitacion: " + numHabitacion + '\n' +
                "cantPersonas: " + cantPersonas + '\n' +
                "fecha entrada: " + fechaEntrada + '\n' +
                "fecha salida: " + fechaSalida + '\n' +
                "-------------------------";
    }
}
