package entidad;

public class Pelicula {
    private final String titulo;
    private final String genero;
    private final int anio;
    private final int duracion;

    public Pelicula(String titulo, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "* Pelicula *" + '\n' +
                " Titulo de la pelicula: " + titulo + '\n' +
                " Genero: " + genero + '\n' +
                " Año de salida: " + anio + '\n' +
                " Duracion total: " + duracion + '\n';
    }
}