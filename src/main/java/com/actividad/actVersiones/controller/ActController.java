package com.actividad.actVersiones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ActController {

    @GetMapping
    public String Saludo() {
        return "Hola Mundo";
    }

    @PostMapping
    public String Despedida() {
        return "Chao Planeta Tierra";
    }

}