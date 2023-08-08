package org.example.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Alojamiento {

    private int reservaId;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "reservaId: " + reservaId + '\n' +
                "-------------------------";
    }
}
