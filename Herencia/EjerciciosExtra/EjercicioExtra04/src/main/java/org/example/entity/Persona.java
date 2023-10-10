package org.example.entity;

public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroIdentificacion;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + "\n" +
                "Número de Identificación: " + numeroIdentificacion + "\n" +
                "Estado Civil: " + estadoCivil;
    }
}
