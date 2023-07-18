package org.example;

import java.util.Random;

public class RandomNumGenerator {

    private final int min;
    private final int max;
    private final Random random;

    public RandomNumGenerator(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public int generateRandomNumber() {
        // Calcula la diferencia entre max y min (rango)
        int range = max - min + 1;

        // Genera un número aleatorio dentro del rango y le suma el valor mínimo
        return random.nextInt(range) + min;
    }
}
