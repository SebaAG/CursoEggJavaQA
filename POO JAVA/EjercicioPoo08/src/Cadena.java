public class Cadena {
    private String frase;
    private int longi;

    public int getLongi() {
        return longi;
    }

    public void setFrase(String frase) {
        this.frase= frase;
        this.longi = frase.length();
    }

    public void mostrarVocales() {
        int cont = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < frase.length(); i++) {
            if (vocales.contains(String.valueOf(frase.charAt(i)))) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales!");
    }

    public void invertirFrase() {
        StringBuilder invert = new StringBuilder(frase);
        invert.reverse();
        System.out.println("Frase invertida: " + invert.toString());
    }

    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)){
                cont++;
            }
        }
        System.out.println("Caracter " + letra + " se repite " + cont + " veces!");
    }

    public void compararLong(String frase2) {
        int long2 = frase2.length();
        if (longi == long2) {
            System.out.println("Las frases tienen la misma longitud!");
        } else if (longi > long2) {
            System.out.println("La frase es mas corta que la primera frase!");
        } else {
            System.out.println("La frase es mas larga que la primera frase!");
        }
    }

    public void unirFrase(String frase2) {
        String uniFrase = frase + " " + frase2;
        System.out.println("Frase: " + uniFrase);
    }

    public void reemplazar(String letra) {
        String nFrase = frase.replace('a', letra.charAt(0));
        System.out.println("Frase: " + nFrase);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }
}