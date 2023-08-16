package org.example;

import org.example.entity.Baraja;
import org.example.entity.Carta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja(12);
        baraja.barajar();
        List<Carta> mano = baraja.darCartas(5);
        System.out.println("CARTAS EN LA MANO: ");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
}