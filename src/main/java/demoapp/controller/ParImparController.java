package demoapp.controller;

import demoapp.service.ParImparService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParImparController {

    private final ParImparService service;

    public ParImparController(ParImparService service) {
        this.service = service;
    }

    @GetMapping("/par-impar")
    public String mostrarFormulario() {
        return "FormParImpar.html";
    }

    @PostMapping("/par-impar")
    @ResponseBody
    public String calcular(@RequestParam("numero") int numero) {
        String resultado = service.determinarParidad(numero);
        return "El número " + numero + " es " + resultado;
    }
}