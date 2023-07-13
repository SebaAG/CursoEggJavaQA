package entidad;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro(){

    }

    @Override
    public String toString() {
        return "* Libro * " + '\n' +
                "ISBN: " + isbn + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Numero de paginas: " + numPag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}
