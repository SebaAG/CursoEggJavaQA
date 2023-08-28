package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Poliza {

    private String numPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantCuotas;
    private Cuota.Pago formaPago;
    private int montoTotalAsegurado;
    private boolean incluyeGranizo;
    private int montoMaximoGranizo;
    private TipoCobertura tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public enum TipoCobertura {
        TOTAL,
        CONTRA_TERCEROS
    }
}
