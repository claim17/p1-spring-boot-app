package demoapp.controller;

import demoapp.service.PalindromoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PalindromoController {

    private final PalindromoService service;

    public PalindromoController(PalindromoService service) {
        this.service = service;
    }

    @GetMapping("/validar")
    public String mostrarFormulario() {
        return "FormPalindromo.html";
    }

    @PostMapping("/validar")
    @ResponseBody
    public String comprobarDesdeForm(@RequestParam("palabra") String palabra) {
        boolean esPalindromo = service.esPalindromo(palabra);
        return esPalindromo ? "¡Es un palíndromo!" : "No, eso no es un palíndromo.";
    }
}