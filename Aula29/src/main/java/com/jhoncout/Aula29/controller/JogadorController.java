package com.jhoncout.Aula29.controller;

import com.jhoncout.Aula29.dao.JogadorDAO;
import com.jhoncout.Aula29.model.Jogador;
import com.jhoncout.Aula29.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogador")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @PostMapping
    public Jogador save(@RequestBody JogadorDAO dao){
        return service.save(dao);
    }

    @GetMapping("/{id}")
    public List<String> getByTreinador(@PathVariable Integer id){
        return service.getJogadoresPorTreinador(id);
    }
}
