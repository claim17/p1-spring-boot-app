package demoapp.service;
import org.springframework.stereotype.Service;

@Service
public class PalindromoService {

    public boolean esPalindromo(String texto) {
        if (texto == null) return false;

        // 1. Limpiamos: minúsculas y fuera espacios
        String limpio = texto.toLowerCase().replace(" ", "");

        // 2. Le damos la vuelta
        String invertido = new StringBuilder(limpio).reverse().toString();

        // 3. Comparamos
        return limpio.equals(invertido);
    }
}
