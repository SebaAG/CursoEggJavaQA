package entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alquiler {
    private final LocalDate fechaIni;
    private final LocalDate fechaFin;
    private final Pelicula pelicula;
    private Double precio;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Alquiler(Pelicula pelicula, LocalDate fechaIni, LocalDate fechaFin, Double precio) {
        this.pelicula = pelicula;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        String fechaInicio = fechaIni.format(formatter);
        String fechaEntrega = fechaFin.format(formatter);
        return "* Alquiler *" + '\n' +
                "Fecha inicio alquiler: " + fechaInicio + '\n' +
                "Fecha de entrega: " + fechaEntrega + '\n' +
                "Nombre de la pelicula: " + pelicula.getTitulo() + '\n' +
                "Precio: " + precio + " $" + '\n';
    }
}