package entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {

    private String titulo;
    private String genero;
    private int anio;
    private int duracion;

    @Override
    public String toString() {
        return "* Pelicula *" + '\n' +
                " Titulo de la pelicula: " + titulo + '\n' +
                " Genero: " + genero + '\n' +
                " Año de salida: " + anio + '\n' +
                " Duracion total: " + duracion + " minutos" + '\n';
    }
}