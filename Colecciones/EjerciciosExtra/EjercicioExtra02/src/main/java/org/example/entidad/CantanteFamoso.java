package org.example.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CantanteFamoso {

    private String nombre;
    private String discoMasVentas;

    @Override
    public String toString() {
        return  " -------------------------  " + '\n' +
                "Nombre del Cantante: " + nombre + '\n' +
                "Disco con más ventas: " + discoMasVentas + '\n' +
                " -------------------------  ";
    }
}
