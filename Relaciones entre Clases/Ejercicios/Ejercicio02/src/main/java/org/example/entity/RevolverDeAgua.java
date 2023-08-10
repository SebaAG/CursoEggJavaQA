package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6) + 1; // posición en el tambor
        posicionAgua = random.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual % 6) + 1;
    }

    @Override
    public String toString() {
        return "-------------------------" + '\n' +
                "Posición actual: " + posicionActual + '\n' +
                "Posición agua: " + posicionAgua + '\n' +
                "-------------------------";
    }
}
