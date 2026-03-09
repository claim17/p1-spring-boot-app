package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class ParImparService {

    public String determinarParidad(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}