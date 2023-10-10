package org.example.entity;

public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                            int anoIncorporacion, String numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    public String getSeccion() {
        return seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Sección: " + seccion;
    }
}
