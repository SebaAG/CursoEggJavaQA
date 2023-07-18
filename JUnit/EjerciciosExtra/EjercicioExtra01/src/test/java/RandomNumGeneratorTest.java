import org.example.RandomNumGenerator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class RandomNumGeneratorTest {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 1000;
    private static final int SAMPLE_SIZE = 100000;
    private static final double TOLERANCE = 5.0;

    @Test
    public void testGenerateRandomNumberWithinRange() {
        RandomNumGenerator rng = new RandomNumGenerator(MIN_RANGE, MAX_RANGE);

        for (int i = 0; i < 1000; i++) {
            int randomNumber = rng.generateRandomNumber();
            assertTrue("El número generado debe estar dentro del rango especificado (1 a 1000)",
                    randomNumber >= MIN_RANGE && randomNumber <= MAX_RANGE);
        }
    }

    @Test
    public void testGenerateRandomNumberProperties() {
        RandomNumGenerator rng = new RandomNumGenerator(MIN_RANGE, MAX_RANGE);
        int sum = 0;

        // Realiza una serie de generaciones y calcula la suma de los números generados
        for (int i = 0; i < SAMPLE_SIZE; i++) {
            int randomNumber = rng.generateRandomNumber();
            sum += randomNumber;
        }

        // Calcula el valor esperado y la desviación estándar del promedio
        double expectedAverage = (double) (MAX_RANGE + MIN_RANGE) / 2;
        double expectedStandardDeviation = Math.sqrt((double) (MAX_RANGE * MAX_RANGE - 1) / 12);

        // Comprueba si el promedio de los números generados está cerca del valor esperado
        double actualAverage = (double) sum / SAMPLE_SIZE;
        assertTrue("El promedio de los números generados no está dentro de un rango aceptable",
                Math.abs(actualAverage - expectedAverage) < TOLERANCE);

        // Comprueba si la desviación estándar está cerca del valor esperado
        double actualStandardDeviation = calculateStandardDeviation(rng, actualAverage);
        assertTrue("La desviación estándar de los números generados no está dentro de un rango aceptable",
                Math.abs(actualStandardDeviation - expectedStandardDeviation) < TOLERANCE);
    }

    // Método para calcular la desviación estándar de los números generados
    private double calculateStandardDeviation(RandomNumGenerator rng, double average) {
        double squaredDifferencesSum = 0.0;

        // Calcula la suma de las diferencias al cuadrado
        for (int i = 0; i < SAMPLE_SIZE; i++) {
            int randomNumber = rng.generateRandomNumber();
            double difference = randomNumber - average;
            squaredDifferencesSum += difference * difference;
        }

        // Divide la suma de las diferencias al cuadrado por el tamaño de la muestra y obtiene la raíz cuadrada
        return Math.sqrt(squaredDifferencesSum / SAMPLE_SIZE);
    }
}