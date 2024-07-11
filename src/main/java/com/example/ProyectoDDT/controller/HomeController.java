package com.example.ProyectoDDT.controller;

//package com.tuempresa.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/inicio")
    public String index() {
        return "index"; // Esto retornaría "index.html" en la carpeta resources/templates, por ejemplo
    }
}