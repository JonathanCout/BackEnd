package com.jhoncout.integradoraaula19.controller;

import com.jhoncout.integradoraaula19.domain.Dentista;
import com.jhoncout.integradoraaula19.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dentista")
public class DentistaRestController {

    @Autowired
    private PacienteService service;

    @GetMapping("listar")
    public List<Dentista> lista(){
        return service.listarDentistas();
    }

    @GetMapping("id/{id}")
    public Dentista buscarPorId(@PathVariable Integer id){
        return service.dentistaPorId(id);
    }
}
