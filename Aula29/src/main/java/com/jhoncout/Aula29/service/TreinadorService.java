package com.jhoncout.Aula29.service;

import com.jhoncout.Aula29.model.Treinador;
import com.jhoncout.Aula29.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService {

    @Autowired
    private TreinadorRepository repository;

    public Treinador insert(Treinador treinador){
        return repository.save(treinador);
    }
}
