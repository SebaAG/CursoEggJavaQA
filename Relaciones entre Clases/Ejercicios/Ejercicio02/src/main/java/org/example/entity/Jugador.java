package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        System.out.println(nombre + " se apunta y dispara.....");
        if (revolver.mojar()) {
            mojado = true;
            return true;
        } else {
            System.out.println(" .....sigue seco una ronda más...");
            revolver.siguienteChorro();
            return false;
        }
    }
}
