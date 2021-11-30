package com.jhoncout.Aula29.service;

import com.jhoncout.Aula29.model.Equipe;
import com.jhoncout.Aula29.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository repository;

    public Equipe insert(Equipe equipe){
        return repository.save(equipe);
    }
}
