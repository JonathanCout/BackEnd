package com.jhoncout.Aula29.controller;

import com.jhoncout.Aula29.model.Treinador;
import com.jhoncout.Aula29.service.TreinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("treinador")
public class TreinadorController {

    @Autowired
    private TreinadorService service;

    @PostMapping
    public Treinador post(@RequestBody Treinador treinador){
        return service.insert(treinador);
    }
}
