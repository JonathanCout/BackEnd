package com.jhoncout.Mesa27.controller;

import com.jhoncout.Mesa27.persistance.entities.UsuarioEntity;
import com.jhoncout.Mesa27.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioEntity> listAll(){
        return service.listAll();
    }

    @PostMapping
    public String save(@RequestBody UsuarioEntity entity){
        if(service.save(entity) !=null){
            return "Dados salvos com sucesso";
        }
        return null;
    }
}
