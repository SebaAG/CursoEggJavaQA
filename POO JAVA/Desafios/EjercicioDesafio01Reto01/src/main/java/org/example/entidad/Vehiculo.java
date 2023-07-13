package org.example.entidad;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class Vehiculo {

    private String marca;
    private String modelo;
    private int anno;
    private String tipo;
    private int veloc;

    public Vehiculo(String marca, String modelo, int anno, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.tipo = tipo;

        if (tipo.equalsIgnoreCase("automovil")) {
            this.veloc = 3;
        } else if (tipo.equalsIgnoreCase("motocicleta")) {
            this.veloc = 2;
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            this.veloc = 1;
        } else {
            System.out.println("Tipo de vehículo inválido.");
        }
    }
}
