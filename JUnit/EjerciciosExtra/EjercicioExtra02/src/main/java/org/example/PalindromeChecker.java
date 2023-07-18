package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Eliminar espacios en blanco y convertir a minúscula para evitar problemas de Case y espacios
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
