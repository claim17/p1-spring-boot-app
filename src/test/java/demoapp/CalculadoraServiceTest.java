package demoapp;

import demoapp.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void testOperacionesBasicas() {
        assertEquals(10.0, service.calcular(5, 5, "+"));
        assertEquals(2.0, service.calcular(5, 3, "-"));
        assertEquals(15.0, service.calcular(3, 5, "*"));
        assertEquals(2.5, service.calcular(5, 2, "/"));
    }

    @Test
    void testDivisionPorCero() {
        // Verificamos que nuestro control de error devuelve 0
        assertEquals(0.0, service.calcular(10, 0, "/"));
    }
}