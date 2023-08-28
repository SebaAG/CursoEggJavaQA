package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String domicilio;
    private String telefono;
}
