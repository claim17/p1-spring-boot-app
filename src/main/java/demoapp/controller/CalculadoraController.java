package demoapp.controller;

import demoapp.service.CalculadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/calculadora")
    public String mostrarFormulario() {
        return "FormCalculadora.html";
    }

    @PostMapping("/calculadora")
    @ResponseBody
    public String operar(@RequestParam double n1, @RequestParam double n2, @RequestParam String op) {
        double resultado = service.calcular(n1, n2, op);
        return "El resultado de " + n1 + " " + op + " " + n2 + " es: " + resultado;
    }
}