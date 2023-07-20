import org.example.DiscountCalculator;
import org.junit.Test;

import static org.junit.Assert.*;


public class DiscountCalculatorTest {

    /**
     * Prueba para verificar el cálculo del descuento con un porcentaje de descuento válido del 75%.
     */
    @Test
    public void testCalculateDiscountValid() {
        DiscountCalculator dc = new DiscountCalculator();
        double originalPrice = 100.0;
        double discountPercentage = 75.0;
        double expectedPrice = 26.0;

        double discountedPrice = dc.calculateDiscount(originalPrice, discountPercentage);

        // Verificar que el precio con descuento sea igual al valor esperado con una tolerancia de 0.1
        assertEquals(expectedPrice, discountedPrice, 0.1);
    }

    /**
     * Prueba para verificar el cálculo del descuento con un porcentaje de descuento del 0%.
     */
    @Test
    public void testCalculateDiscountZeroDiscount() {
        DiscountCalculator dc = new DiscountCalculator();
        double originalPrice = 100.0;
        double discountPercentage = 0.0;

        double discountedPrice = dc.calculateDiscount(originalPrice, discountPercentage);

        assertEquals(originalPrice, discountedPrice, 0.1);
    }

    /**
     * Prueba para verificar el cálculo del descuento con el porcentaje de descuento máximo del 100%.
     */
    @Test
    public void testCalculateDiscountMaxDiscount() {
        DiscountCalculator dc = new DiscountCalculator();
        double originalPrice = 100.0;
        double discountPercentage = 100.0;
        double expectedPrice = 0.0;

        double discountedPrice = dc.calculateDiscount(originalPrice, discountPercentage);

        // Verificar que el precio con descuento sea igual a 0 con una tolerancia de 0.1
        assertEquals(expectedPrice, discountedPrice, 0.1);
    }

    /**
     * Prueba para verificar que se lance una excepción IllegalArgumentException
     * al proporcionar un porcentaje de descuento inválido (menor que 0).
     */
    @Test
    public void testCalculateDiscountInvalid() {
        DiscountCalculator dc = new DiscountCalculator();
        double originalPrice = 100.0;
        double invalidDiscountPercentage = -10.0;

        // Verificar que se lance una excepción IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () ->
                dc.calculateDiscount(originalPrice, invalidDiscountPercentage));
    }
}
