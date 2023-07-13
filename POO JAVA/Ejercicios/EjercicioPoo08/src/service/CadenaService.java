package service;

import entidad.Cadena;

/**

 Esta clase proporciona operaciones y servicios relacionados con una cadena de texto.
 */
public class CadenaService {
    private final Cadena frase;

    /**

     Constructor de la clase CadenaService.
     @param cadena La cadena de texto a ser procesada.
     */
    public CadenaService(Cadena cadena) {
        this.frase = cadena;
    }
    /**

     Muestra la cantidad de vocales presentes en la frase.
     */
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

    /**

     Invierte la frase y la muestra en pantalla.
     */
    public void invertirFrase() {
        if (frase.getFrase() == null) {
            System.out.println("No se ha ingresado ninguna frase.");
            return;
        }

        StringBuilder invert = new StringBuilder(frase.getFrase());
        invert.reverse();
        System.out.println("Frase invertida: " + invert);
    }

    /**

     Muestra la cantidad de veces que una letra se repite en la frase.
     @param letra La letra a ser buscada en la frase.
     */
    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().charAt(i) == letra.charAt(0)){
                cont++;
            }
        }
        System.out.println("Caracter " + letra + " se repite " + cont + " veces!");
    }
    /**

     Compara la longitud de la frase con otra frase dada.
     @param frase2 La segunda frase a ser comparada en longitud.
     */
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
    /**

     Une la frase actual con otra frase dada.
     @param frase2 La segunda frase a ser unida.
     */
    public void unirFrase(String frase2) {
        String uniFrase = frase.getFrase() + " " + frase2;
        System.out.println("Frase: " + uniFrase);
    }
    /**

     Reemplaza todas las ocurrencias de la letra 'a' en la frase con otra letra dada.
     @param letra La letra que reemplazará las ocurrencias de 'a'.
     */
    public void reemplazar(String letra) {
        String nFrase = frase.getFrase().replace('a', letra.charAt(0));
        System.out.println("Frase: " + nFrase);
    }
}