package com.jhoncout.Aula26.controller;

import com.jhoncout.Aula26.dao.FilmeDAO;
import com.jhoncout.Aula26.model.Filme;
import com.jhoncout.Aula26.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<Map<Integer,Filme>> createFilme(@RequestBody FilmeDAO dao){
        return ResponseEntity.ok(service.create(dao));
    }

    @GetMapping
    public ResponseEntity<Map<Integer, Filme>> getFilmes(){
        return ResponseEntity.ok(service.selectAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<Integer,Filme>> getFilmeId(@PathVariable Integer id){
        return ResponseEntity.ok(service.selectId(id));
    }

    @PutMapping
    public ResponseEntity<Map<Integer,Filme>> updateFilme(@RequestBody FilmeDAO dao){
        return ResponseEntity.ok(service.update(dao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFilme(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }
}
