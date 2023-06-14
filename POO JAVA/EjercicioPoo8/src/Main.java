import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Cadena cadena = new Cadena();

        System.out.print("Ingresar una frase: ");
        String frase = tecla.nextLine();
        cadena.setFrase(frase);
        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.print("Ingresar letra para ver cuanto se repite: ");
        String letra = tecla.nextLine();
        cadena.vecesRepetido(letra);
        System.out.print("Ingrese una segunda frase para comprar longitud: ");
        String frase2 = tecla.nextLine();
        cadena.compararLong(frase2);
        System.out.print("Ingrese otra frase para unirlas: ");
        frase2 = tecla.nextLine();
        cadena.unirFrase(frase2);
        System.out.print("Ingrese una letra que reemplace las 'a': ");
        letra = tecla.nextLine();
        cadena.reemplazar(letra);
        System.out.print("Ingresar una letra para verificar esta en la frase: ");
        letra = tecla.nextLine();
        boolean cont = cadena.contiene(letra);
        System.out.println("La frase " + (cont ? "si" : "no") + " contiene la letra " + letra);
    }
}