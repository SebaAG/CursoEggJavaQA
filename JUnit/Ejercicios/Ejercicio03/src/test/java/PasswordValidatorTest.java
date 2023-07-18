import org.junit.Test;

import static org.example.PasswordValidator.pwValid;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {

        // Contraseñas válidas
        assertTrue(pwValid("StrongP@ssword1"));
        assertTrue(pwValid("Secur3P@ss!"));

        // Contraseñas inválidas
        assertFalse(pwValid("weak"));
        assertFalse(pwValid("no_special_chars"));
        assertFalse(pwValid("NoNumberOrSpecialChar"));
    }
}
