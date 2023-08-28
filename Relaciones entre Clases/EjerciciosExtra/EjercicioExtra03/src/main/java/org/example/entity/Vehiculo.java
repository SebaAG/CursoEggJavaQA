package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private String numMotor;
    private String chasis;
    private String color;
    private Tipo tipoVehiculo;

    public enum Tipo {
        CAMIONETA,
        SEDAN,
        DEPORTIVO
    }
}
