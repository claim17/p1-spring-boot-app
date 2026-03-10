package demoapp;

import demoapp.service.CuadradoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CuadradoServiceTest {

    private final CuadradoService service = new CuadradoService();

    @Test
    void testEsCuadradoCorrecto() {
        assertTrue(service.esCuadrado(3, 9));
        assertTrue(service.esCuadrado(-4, 16));
        assertTrue(service.esCuadrado(2.5, 6.25));
    }

    @Test
    void testNoEsCuadrado() {
        assertFalse(service.esCuadrado(2, 5));
        assertFalse(service.esCuadrado(3, -9)); // Un cuadrado nunca es negativo
    }
}