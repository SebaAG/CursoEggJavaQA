import org.example.entity.AnalizadorTexto;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class AnalizadorTextoTest {

    @Test
    public void testContarPalabras_TextoVacio() {
        int resultado = AnalizadorTexto.contarPalabras("");
        assertEquals(0, resultado);
    }

    @Test
    public void testContarPalabras_TextoConPalabras() {
        int resultado = AnalizadorTexto.contarPalabras("Este es un texto de prueba.");
        assertEquals(6, resultado);
    }

    @Test
    public void testContarFrases_TextoVacio() {
        int resultado = AnalizadorTexto.contarFrases("");
        assertEquals(0, resultado);
    }

    @Test
    public void testContarFrases_TextoConFrases() {
        int resultado = AnalizadorTexto.contarFrases("Esta es una oración. Esta es otra oración.");
        assertEquals(2, resultado);
    }

    @Test
    public void testObtenerFrecuenciaPalabras_TextoVacio() {
        Map<String, Integer> resultado = AnalizadorTexto.obtenerFrecuenciaPalabras("");
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testObtenerFrecuenciaPalabras_TextoConPalabrasRepetidas() {
        String texto = "hola hola mundo mundo hola";
        Map<String, Integer> resultado = AnalizadorTexto.obtenerFrecuenciaPalabras(texto);

        assertEquals(2, resultado.size()); //ESTO REVISA LA CANTIDAD DE PALABRAS GUARDADAS
        assertEquals(3, resultado.get("hola"));
        assertEquals(2, resultado.get("mundo"));
        assertNotEquals(1, resultado.get("mundo"));
    }
}
