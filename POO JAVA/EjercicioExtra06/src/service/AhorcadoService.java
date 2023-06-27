package service;

import entidad.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private final Scanner tecla = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        String[] palabraSecreta;
        String[] palabraOculta;
        int contador = 0;
        System.out.println("Ingrese la palabra secreta: ");
        String palabra = tecla.next();
        palabraSecreta = new String[palabra.length()];
        palabraOculta = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraSecreta[i] = palabra.substring(i, i + 1);
            palabraOculta[i] = "?";
        }

        a1.setPalabraSecreta(palabraSecreta);
        a1.setPalabraOculta(palabraOculta);
        a1.setLetrasEncontradas(0);
        a1.setJugadaMaxima(6);

        return a1;
    }

    public boolean verificarLetra(String letra, Ahorcado a1) {
        boolean letraEncontrada = false;
        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {
            if (a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                letraEncontrada = true;
                a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
                System.out.println(a1.getLetrasEncontradas());
            }
        }
        return letraEncontrada;
    }

    public boolean palabraCompleta(Ahorcado a1) {
        return a1.getLetrasEncontradas() == a1.getPalabraSecreta().length;
    }

    public void reducirJugada(Ahorcado a1) {
        a1.setJugadaMaxima(a1.getJugadaMaxima() - 1);
        System.out.println("Te quedan " + a1.getJugadaMaxima() + " intentos.");
    }

    public void actualizarPalabraSecreta(String letra, Ahorcado a1) {
        String[] palabraOculta = a1.getPalabraOculta();
        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {
            if (a1.getPalabraOculta()[i].equals("?") && a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                palabraOculta[i] = letra;
            }
        }
        System.out.print("Palabra oculta actualizada: ");
        System.out.println(Arrays.toString(a1.getPalabraOculta()));
    }

    public void empezarJuego() {
        String letra;
        Ahorcado game = crearJuego();
        System.out.println("Aca va una pista, es una palabra de " + game.getPalabraSecreta().length + " letras.");
        System.out.println();
        System.out.println(Arrays.toString(game.getPalabraOculta()));
        do {
            System.out.println("Ingrese una letra: ");
            letra = tecla.next();
            if (verificarLetra(letra, game)) {
                System.out.println("La letra se encuentra en la palabra");
                actualizarPalabraSecreta(letra, game);
            } else {
                System.out.println("La letra no se encuentra en la palabra");
                reducirJugada(game);
            }
        } while (!palabraCompleta(game) && game.getJugadaMaxima() != 0);
    }
}
