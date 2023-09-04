package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public void Alimentandose() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }
}
