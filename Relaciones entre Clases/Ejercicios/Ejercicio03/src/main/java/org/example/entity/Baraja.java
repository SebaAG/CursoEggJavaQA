package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
@Setter
@AllArgsConstructor
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> pozo;

    public Baraja() {
        cartas = new ArrayList<>();
        pozo = new ArrayList<>();
        for (int numero = 1; numero <= 12; numero++) {
            for (Carta.Palo palo : Carta.Palo.values()) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            pozo.add(carta);
            return carta;
        } else {
            System.out.println("***** NO HAY MÁS CARTAS EN LA BARAJA *****");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cant) {
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        if (cartasDisponibles() >= cant) {
            for (int i = 0; i < cant; i++) {
                cartasDadas.add(siguienteCarta());
            }
        } else {
            System.out.println("***** NO HAY SUFICIENTES CARTAS *****");
        }
        return cartasDadas;
    }

    public void cartasMonton() {
        if (!pozo.isEmpty()) {
            System.out.println("CARTAS EN EL POZO: ");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No hay ninguna carta!");
        }
    }

    public void mostrarBaraja() {
        System.out.println("***** CARTAS EN BARAJA *****");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
