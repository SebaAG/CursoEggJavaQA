package service;

import entidad.Cadena;

public class CadenaService {
    private Cadena frase;



    public CadenaService(Cadena cadena) {
        this.frase = cadena;
    }

    public void mostrarVocales() {
        if (frase.getFrase() == null) {
            System.out.println("No se ha ingresado ninguna frase.");
            return;
        }

        int cont = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (vocales.contains(String.valueOf(frase.getFrase().charAt(i)))) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales!");
    }

    public void invertirFrase() {
        if (frase.getFrase() == null) {
            System.out.println("No se ha ingresado ninguna frase.");
            return;
        }

        StringBuilder invert = new StringBuilder(frase.getFrase());
        invert.reverse();
        System.out.println("Frase invertida: " + invert.toString());
    }

    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().charAt(i) == letra.charAt(0)){
                cont++;
            }
        }
        System.out.println("Caracter " + letra + " se repite " + cont + " veces!");
    }

    public void compararLong(String frase2) {
        int long2 = frase2.length();
        if (frase.getLongi() == long2) {
            System.out.println("Las frases tienen la misma longitud!");
        } else if (frase.getLongi() > long2) {
            System.out.println("La frase es más corta que la primera frase!");
        } else {
            System.out.println("La frase es más larga que la primera frase!");
        }
    }

    public void unirFrase(String frase2) {
        String uniFrase = frase.getFrase() + " " + frase2;
        System.out.println("Frase: " + uniFrase);
    }

    public void reemplazar(String letra) {
        String nFrase = frase.getFrase().replace('a', letra.charAt(0));
        System.out.println("Frase: " + nFrase);
    }

    public boolean contiene(String letra) {
        return frase.getFrase().contains(letra);
    }
}