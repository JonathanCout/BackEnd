package com.jhoncout.Aula23.controller;

import com.jhoncout.Aula23.dao.ConsultaDAO;
import com.jhoncout.Aula23.model.Consulta;
import com.jhoncout.Aula23.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping
    public ResponseEntity<Map<Integer, Consulta>> getConsultas(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarConsulta());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarConsulta (@PathVariable Integer id){
        service.deletarConsulta(id);
        return ResponseEntity.ok("Consulta deletada com sucesso");
    }

    @PostMapping
    public ResponseEntity<Consulta> postConsulta(@RequestBody ConsultaDAO dao){
        Consulta consulta = service.criarConsulta(dao);

        if(consulta == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(consulta);
    }

    @PutMapping
    public ResponseEntity<Consulta> putConsulta(@RequestBody ConsultaDAO dao){
        return ResponseEntity.status(200).body(service.editarConsulta(dao));
    }
}
