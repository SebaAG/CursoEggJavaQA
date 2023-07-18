import org.example.DateValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateValidatorTest {

    @Test
    public void testValidDate() {
        DateValidator dv = new DateValidator();

        // FECHAS VALIDAS
        assertTrue(dv.validDate(1, 1, 2023));
        assertTrue(dv.validDate(29, 2, 2024)); // Año bisiesto
        assertTrue(dv.validDate(31, 12, 2120));

        // FECHAS INVALIDAS
        assertFalse(dv.validDate(0, 1, 2023)); // Día inválido (día menor que 0)
        assertFalse(dv.validDate(32, 1, 2023)); // Día inválido (mayor que 31)
        assertFalse(dv.validDate(29, 2, 2023)); // Día inválido (año NO bisiesto)
        assertFalse(dv.validDate(4, 13, 2023)); // Mes inválido (mayor que 12)
        assertFalse(dv.validDate(31, 6, 2023)); // Mes inválido (junio tiene 30 días)
    }
}
