package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double calcular(double n1, double n2, String operacion) {
        switch (operacion) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/":
                if (n2 == 0) return 0.0; // Control de error básico
                return n1 / n2;
            default: return 0.0;
        }
    }
}