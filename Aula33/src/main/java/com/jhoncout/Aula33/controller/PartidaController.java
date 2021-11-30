package com.jhoncout.Aula33.controller;

import com.jhoncout.Aula33.dao.PartidaDAO;
import com.jhoncout.Aula33.model.Partida;
import com.jhoncout.Aula33.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partida")
public class PartidaController {

    @Autowired
    private PartidaService service;

    @PostMapping
    public Partida createPartida(@RequestBody PartidaDAO dao){
        return service.createPartida(dao);
    }
}
