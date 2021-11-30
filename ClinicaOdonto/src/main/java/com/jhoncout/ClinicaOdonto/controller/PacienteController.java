package com.jhoncout.ClinicaOdonto.controller;

import com.jhoncout.ClinicaOdonto.dao.PacienteDAO;
import com.jhoncout.ClinicaOdonto.persistance.entities.Endereco;
import com.jhoncout.ClinicaOdonto.persistance.entities.Paciente;
import com.jhoncout.ClinicaOdonto.service.PacienteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    private static final Logger logger = Logger.getLogger(PacienteController.class);
    @Autowired
    private PacienteService service;

    @PostMapping
    public ResponseEntity<Paciente> insert(@RequestBody PacienteDAO dao){
        try{
            logger.info("Paciente inserido com sucesso.");
            return ResponseEntity.ok(service.insert(dao));
        }
        catch (Exception e){
            logger.error("Houve um erro ao adicionar o Paciente.");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> getAllPacientes(){
        try {
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getAllPacientes());
        }
        catch (Exception e){
            logger.error("Houve um erro ao buscar os Pacientes.");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable Integer id){
        try {
            logger.info("Resultado da busca:");
            return ResponseEntity.ok(service.getPacienteById(id));
        }
        catch (Exception e){
            logger.error("Houve um erro ao buscar o Paciente");
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> updatePaciente(@RequestBody PacienteDAO dao, @PathVariable Integer id){
        try {
            logger.info("Paciente atualizado com sucesso");
            return ResponseEntity.ok(service.updatePaciente(dao, id));
        }
        catch (Exception e){
            logger.error("Houve um erro ao atualizar os dados do Paciente.");
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}-endereco")
    public ResponseEntity<Paciente> updateEnderecoPaciente(@RequestBody Endereco endereco, @PathVariable Integer id){
        try {
            logger.info("Endereço do paciente atualizado com sucesso.");
            return ResponseEntity.ok(service.updateEnderecoPaciente(endereco, id));
        }
        catch (Exception e){
            logger.error("Houve uim erro ao atualizar o endereço do Paciente");
            return ResponseEntity.badRequest().build();
        }
    }
}
