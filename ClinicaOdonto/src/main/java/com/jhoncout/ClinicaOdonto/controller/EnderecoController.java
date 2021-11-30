package com.jhoncout.ClinicaOdonto.controller;

import com.jhoncout.ClinicaOdonto.persistance.entities.Endereco;
import com.jhoncout.ClinicaOdonto.service.EnderecoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

    private static final Logger logger = Logger.getLogger(EnderecoController.class);
    @Autowired
    private EnderecoService service;

    @PostMapping
    public Endereco insert(@RequestBody Endereco endereco){
        return service.insert(endereco);
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> getAllEndereco(){
        try{
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getAllEndereco());
        }
        catch (Exception e){
            logger.error("Erro ao buscar Endereos.");
            return ResponseEntity.badRequest().build();
        }
    }
}
