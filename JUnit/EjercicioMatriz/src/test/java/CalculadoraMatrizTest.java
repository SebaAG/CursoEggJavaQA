import org.example.entity.CalculadoraMatriz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CalculadoraMatrizTest {
    private CalculadoraMatriz calMatriz;

    @Before
    public void setear() {
        calMatriz = new CalculadoraMatriz();
    }

    @Test
    public void testSumar() {
        int[][] matrix1 = { { 1, 2 }, { 3, 4 } };
        int[][] matrix2 = { { 5, 6 }, { 7, 8 } };
        int[][] esperado = { { 6, 8 }, { 10, 12 } };

        int[][] resultado = calMatriz.sumar(matrix1, matrix2);

        Assert.assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testRestar() {
        int[][] matrix1 = { { 5, 8 }, { 2, 4 } };
        int[][] matrix2 = { { 3, 1 }, { 6, 7 } };
        int[][] esperado = { { 2, 7 }, { -4, -3 } };

        int[][] resultado = calMatriz.restar(matrix1, matrix2);

        Assert.assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testMultiplicar() {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        int[][] esperado = { { 58, 64 }, { 139, 154 } };

        int[][] resultado = calMatriz.multiplicar(matrix1, matrix2);

        Assert.assertArrayEquals(esperado, resultado);
    }
    @Test
    public void testSumarConExcepcionLanzada() {
        CalculadoraMatriz calculadora = new CalculadoraMatriz();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.sumar(matrix1, matrix2);
        });
    }

    @Test
    public void testRestarConExcepcionLanzada() {
        CalculadoraMatriz calculadora = new CalculadoraMatriz();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.restar(matrix1, matrix2);
        });
    }

    @Test
    public void testMultiplicarConExcepcionLanzada() {
        CalculadoraMatriz calculadora = new CalculadoraMatriz();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.multiplicar(matrix1, matrix2);
        });
    }
}

