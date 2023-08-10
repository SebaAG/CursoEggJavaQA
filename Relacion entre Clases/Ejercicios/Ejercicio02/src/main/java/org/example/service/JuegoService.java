package org.example.service;

import org.example.entity.Jugador;
import org.example.entity.RevolverDeAgua;

import java.util.ArrayList;

public class JuegoService {

    private final ArrayList<Jugador> jugadores;
    private final RevolverDeAgua revolver;

    public JuegoService(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {
        revolver.llenarRevolver();
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)) {
                System.out.println(jugador.getNombre() + " se mojó!!");
                return;
            }
        }
    }
}
