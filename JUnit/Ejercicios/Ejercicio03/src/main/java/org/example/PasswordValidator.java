package org.example;

public class PasswordValidator {

    // Método para verificar si una contraseña es válida
    public static boolean pwValid(String pw) {

        boolean length = pw.length() >= 8; // Mínimo 8 caracteres
        boolean special = pw.matches(".*[!@#$%^&*()].*"); // Al menos un carácter especial
        boolean upper = pw.matches(".*[A-Z].*"); // Al menos una letra mayúscula

        return length && special && upper;
    }
}
