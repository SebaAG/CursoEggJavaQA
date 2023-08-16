package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Baraja {

    private List<Carta> cartas = new ArrayList<>();
    private List<Carta> pozo = new ArrayList<>();

    public Baraja(int numeroCartas) {
        for (int numero = 1; numero <= numeroCartas; numero++) {
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

    public List<Carta> darCartas(int cant) {
        List<Carta> cartasDadas = new ArrayList<>();
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
            for (Carta carta : pozo) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No hay ninguna carta en el pozo!");
        }
    }

    public void mostrarBaraja() {
        System.out.println("***** CARTAS EN BARAJA *****");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
