package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tienda {

    private int idTienda;
    private List<Producto> productos = new ArrayList<>();
    private String direccion;
    private String representante;
}
