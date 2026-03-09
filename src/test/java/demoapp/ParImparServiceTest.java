package demoapp;


import demoapp.service.ParImparService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParImparServiceTest {

    private final ParImparService service = new ParImparService();

    @Test
    void testEsPar() {
        assertEquals("Par", service.determinarParidad(4));
        assertEquals("Par", service.determinarParidad(0));
    }

    @Test
    void testEsImpar() {
        assertEquals("Impar", service.determinarParidad(7));
        assertEquals("Impar", service.determinarParidad(-1));
    }
}