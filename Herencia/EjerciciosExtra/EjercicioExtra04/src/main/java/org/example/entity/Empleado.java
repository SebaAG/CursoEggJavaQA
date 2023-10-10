package org.example.entity;

public abstract class Empleado extends Persona {
    private int anoIncorporacion;
    private String numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Año de Incorporación: " + anoIncorporacion + "\n" +
                "Número de Despacho: " + numeroDespacho;
    }
}
