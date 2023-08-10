package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carta {

    private int numero;
    private Palo palo;

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    enum Palo {
        ESPADA, BASTO, ORO, COPA
    }
}
