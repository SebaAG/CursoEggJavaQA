package org.example.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Alojamiento {

    private UUID reservaId;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "reservaId: " + reservaId + '\n' +
                "-------------------------";
    }
}
