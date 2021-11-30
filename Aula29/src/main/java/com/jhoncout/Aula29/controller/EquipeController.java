package com.jhoncout.Aula29.controller;

import com.jhoncout.Aula29.model.Equipe;
import com.jhoncout.Aula29.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipe")
public class EquipeController {

    @Autowired
    private EquipeService service;

    @PostMapping
    public Equipe insert(@RequestBody Equipe equipe){
        return service.insert(equipe);
    }
}
