package com.jhoncout.Aula27.service;

import com.jhoncout.Aula27.persistance.entities.MovimentoEntity;
import com.jhoncout.Aula27.persistance.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository repository;

    public List<MovimentoEntity> listall(){
        return repository.findAll();
    }

    public String save(MovimentoEntity movimento){
        if(repository.save(movimento) != null){
            return "Dados salvos com sucesso";
        }
        return null;
    }
}
