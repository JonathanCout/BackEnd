package com.jhoncout.ClinicaOdonto.service;

import com.jhoncout.ClinicaOdonto.persistance.entities.Dentista;
import com.jhoncout.ClinicaOdonto.persistance.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {

    @Autowired
    private DentistaRepository repository;

    public Dentista insert(Dentista dentista){
        return repository.save(dentista);
    }

    public List<Dentista> getAllDentistas(){
        return repository.findAll();
    }
    public Dentista getDentistaById(Integer id){
        return repository.getById(id);
    }
    public Dentista updateDentista(Dentista dentista,Integer id){
        Dentista dentistaUpdated = repository.getById(id);
        dentistaUpdated.setEmail(dentista.getEmail());
        return repository.save(dentistaUpdated);
    }
}
