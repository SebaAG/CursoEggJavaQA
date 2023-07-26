package org.example.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int cantInventario;

    @Override
    public String toString() {
        return  "-------------------------" + '\n' +
                "Nombre de Producto: " + nombre + '\n' +
                "Categoría: " + categoria + '\n' +
                "Precio: " + precio + '\n' +
                "Cantidad en inventario: " + cantInventario + '\n' +
                "-------------------------" ;
    }
}
