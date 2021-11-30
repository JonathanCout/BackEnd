package com.jhoncout.ClinicaOdonto.controller;

import com.jhoncout.ClinicaOdonto.persistance.entities.Dentista;
import com.jhoncout.ClinicaOdonto.service.DentistaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dentista")
public class DentistaController {
    private static final Logger logger = Logger.getLogger(DentistaController.class);
    @Autowired
    private DentistaService service;

    @PostMapping
    public ResponseEntity<Dentista> insert(@RequestBody Dentista dentista){
        try{
            logger.info("Dentista criado com sucesso.");
            return ResponseEntity.ok(service.insert(dentista));
        }
        catch (Exception e){
            logger.error("Erro ao criar dentista.");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> getAllDentistas(){
        try{
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getAllDentistas());
        }
        catch (Exception e){
            logger.error("Erro ao buscar os Dentistas.");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> getDentistaById(@PathVariable Integer id){
        try {
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getDentistaById(id));
        }
        catch (Exception e){
            logger.error("Erro ao buscar o Dentista.");
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dentista> updateDentista(@RequestBody Dentista dentista, @PathVariable Integer id){
        try {
            logger.info("Dentista atualizado");
            return ResponseEntity.ok(service.updateDentista(dentista,id));
        }
        catch (Exception e){
            logger.error("Erro ao atualizar dados do Dentista.");
            return ResponseEntity.badRequest().build();
        }
    }
}
