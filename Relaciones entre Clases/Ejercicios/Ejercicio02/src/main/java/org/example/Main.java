package org.example;

import org.example.entity.Jugador;
import org.example.entity.RevolverDeAgua;
import org.example.service.JuegoService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int numJugadores = 6;
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        RevolverDeAgua revolver = new RevolverDeAgua();
        JuegoService juego = new JuegoService(jugadores, revolver);
        juego.llenarJuego();
        juego.ronda();
    }
}