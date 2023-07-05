package entidad;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro(){

    }

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "* Libro * " + '\n' +
                "ISBN: " + isbn + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Numero de paginas: " + numPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}
