import org.example.entity.GeneradorClaveSegura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorClaveSeguraTest {
    private GeneradorClaveSegura generadorClaveSegura;

    @BeforeEach
    public void setUp() {
        generadorClaveSegura = new GeneradorClaveSegura();
    }

    @Test
    public void testGenerarClaveSegura_LongitudMinimaCumplida() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.length() >= generadorClaveSegura.obtenerLongitudMinima());
    }

    @Test
    public void testGenerarClaveSegura_ContieneMayusculas() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.matches(".*[A-Z].*"));
    }

    @Test
    public void testGenerarClaveSegura_ContieneMinusculas() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.matches(".*[a-z].*"));
    }

    @Test
    public void testGenerarClaveSegura_ContieneNumeros() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.matches(".*\\d.*"));
    }

    @Test
    public void testGenerarClaveSegura_ContieneCaracteresEspeciales() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.matches(".*[!@#\\$%^&*_=+\\-/].*"));
    }

    @Test
    public void testGenerarClaveSegura_SoloContieneCaracteresPermitidos() {
        String clave = generadorClaveSegura.generarClaveSegura();
        assertTrue(clave.matches("^[A-Za-z0-9!@#\\$%^&*_=+\\-/]+$"));
    }

    // Prueba repetida para mejorar la cobertura
    @RepeatedTest(10)
    public void testGenerarClaveSegura_RepetirGeneracion() {
        String clave1 = generadorClaveSegura.generarClaveSegura();
        String clave2 = generadorClaveSegura.generarClaveSegura();
        assertNotEquals(clave1, clave2);
    }
}
