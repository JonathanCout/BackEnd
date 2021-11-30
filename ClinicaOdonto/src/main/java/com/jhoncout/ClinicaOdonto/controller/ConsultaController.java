package com.jhoncout.ClinicaOdonto.controller;

import com.jhoncout.ClinicaOdonto.dao.ConsultaDAO;
import com.jhoncout.ClinicaOdonto.persistance.entities.Consulta;
import com.jhoncout.ClinicaOdonto.service.ConsultaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

    private static final Logger logger = Logger.getLogger(ConsultaController.class);
    @Autowired
    private ConsultaService service;

    @PostMapping
    public ResponseEntity<Consulta> insert(@RequestBody ConsultaDAO dao){
        try{
            logger.info("Consulta agendada.");
            return ResponseEntity.ok(service.insert(dao));
        }
        catch (Exception e){
            logger.error("Erro ao agendar consulta.");
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Consulta> update(@RequestBody ConsultaDAO dao,@PathVariable Integer id){
        try{
            logger.info("Consulta atualizada");
            return ResponseEntity.ok(service.update(dao,id));
        }
        catch (Exception e){
            logger.error("Erro detectado ao atualizar consulta");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> getAllConsultas(){
        try{
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getAllConsultas());
        }
        catch (Exception e){
            logger.error("Erro ao buscar as consultas");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> getConsultaById(@PathVariable Integer id){
        try{
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getConsultaById(id));
        }
        catch (Exception e){
            logger.error("Erro ao buscar a consulta.");
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteConsulta(@PathVariable Integer id){
        try{
            service.removeConsulta(id);
            logger.info("Consulta removida");
            return ResponseEntity.ok("Consulta removida com sucesso.");
        }
        catch (Exception e){
            logger.error("Erro ao remover a consulta.");
            return ResponseEntity.badRequest().build();
        }
    }
}
