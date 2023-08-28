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
public class Cuota {

    private int numCuota;
    private int montoTotalCuota;
    private boolean estaPagado;
    private LocalDate fechaVencimiento;
    private Pago formaPago;

    public enum Pago {
        EFECTIVO,
        TRANSFERENCIA,
        CHEQUE
    }
}
