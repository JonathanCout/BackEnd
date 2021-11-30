package com.jhoncout.Integradora28.controller;

import com.jhoncout.Integradora28.persistance.entities.ProdutoEntity;
import com.jhoncout.Integradora28.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody ProdutoEntity produto){
        if(service.save(produto) != null){
            return ResponseEntity.ok("Produto salvo com sucesso!");
        }
        return null;
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<String> delete(@PathVariable Integer id){
        if(service.delete(id)!=null){
            return ResponseEntity.ok("Produto remoido com sucesso!");
        }
        return null;
    }

    @PutMapping
    public ResponseEntity<ProdutoEntity> update(@RequestBody ProdutoEntity produto){
        return ResponseEntity.ok(service.update(produto));
    }

}
