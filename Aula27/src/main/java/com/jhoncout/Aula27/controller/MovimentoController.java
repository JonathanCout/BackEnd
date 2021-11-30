package com.jhoncout.Aula27.controller;

import com.jhoncout.Aula27.persistance.entities.MovimentoEntity;
import com.jhoncout.Aula27.service.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovimentoController {

    @Autowired
    private MovimentoService service;

    @GetMapping
    public ResponseEntity<List<MovimentoEntity>> getAll(){
        return ResponseEntity.ok(service.listall());
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody MovimentoEntity movimento){
        if(service.save(movimento) != null){
            return ResponseEntity.ok("Dados salvos com sucesso");
        }
        return ResponseEntity.badRequest().body("Erro ao salvar dados");
    }
}
