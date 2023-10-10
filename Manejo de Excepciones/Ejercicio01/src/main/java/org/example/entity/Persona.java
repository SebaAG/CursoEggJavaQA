package org.example.entity;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
    }

    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
            this.edad = edad;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            // Puedes tomar medidas adicionales si es necesario, como asignar un valor por defecto o notificar al usuario.
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        try {
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                throw new IllegalArgumentException("El sexo debe ser 'H', 'M' u 'O'");
            }
            this.sexo = sexo;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}