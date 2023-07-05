package entidad;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}