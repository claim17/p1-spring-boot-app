package demoapp.controller;

import demoapp.service.CuadradoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CuadradoController {

    private final CuadradoService service;

    public CuadradoController(CuadradoService service) {
        this.service = service;
    }

    @GetMapping("/cuadrado")
    public String mostrarFormulario() {
        return "FormCuadrado.html";
    }

    @PostMapping("/cuadrado")
    @ResponseBody
    public String comprobarCuadrado(@RequestParam("x") double x, @RequestParam("y") double y) {
        boolean resultado = service.esCuadrado(x, y);

        if (resultado) {
            return "¡Correcto! " + y + " es el cuadrado de " + x;
        } else {
            return "Incorrecto: " + y + " NO es el cuadrado de " + x;
        }
    }
}