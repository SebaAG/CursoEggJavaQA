package entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alquiler {

    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private Pelicula pelicula;
    private Double precio;

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