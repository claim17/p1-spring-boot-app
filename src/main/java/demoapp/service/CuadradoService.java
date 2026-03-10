package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CuadradoService {

    public boolean esCuadrado(double x, double y) {
        // Comprobamos si y es igual a x al cuadrado
        return y == (x * x);
    }
}
