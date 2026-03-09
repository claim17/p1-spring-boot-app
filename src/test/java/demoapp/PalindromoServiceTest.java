package demoapp;

// Estos imports son los que el IDE tiene que encontrar tras el Reload
import demoapp.service.PalindromoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromoServiceTest {

    // Creamos el servicio a mano para que no dependa de @Autowired
    private final PalindromoService service = new PalindromoService();

    @Test
    void testEsPalindromoSimple() {
        assertTrue(service.esPalindromo("ana"));
    }

    @Test
    void testEsPalindromoConEspacios() {
        // Asegúrate de que tu service use .replace(" ", "") para que este pase
        assertTrue(service.esPalindromo("anita lava la tina"));
    }

    @Test
    void testNoEsPalindromo() {
        assertFalse(service.esPalindromo("informatica"));
    }
}