package org.example.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejempPrestados;

    @Override
    public String toString() {
        return "-------------------------" + '\n' +
                "Titulo del libro: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Ejemplares: " + ejemplares + '\n' +
                "Ejemplares Prestados: " + ejempPrestados + '\n' +
                "-------------------------";
    }
}
