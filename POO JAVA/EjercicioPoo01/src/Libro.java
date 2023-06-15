import java.util.Scanner;

public class Libro {
    Scanner tecla = new Scanner(System.in);
    private String isbn;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro(){

    }

    public Libro(String isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void cargaLibro() {
        System.out.print("Ingresar numero de ISBN: ");
        isbn = tecla.nextLine();
        System.out.print("Ingrese titulo del libro: ");
        titulo = tecla.nextLine();
        System.out.print("Ingrese nombre del autor: ");
        autor = tecla.nextLine();
        System.out.print("ingrese el numero de paginas: ");
        numPag = tecla.nextInt();
    }

    public void mostrarInfo() {
        System.out.println("Numero de ISBN: " + isbn);
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Numero de paginas: " + numPag);
    }
}