package com.jhoncout.ClinicaOdonto.service;

import com.jhoncout.ClinicaOdonto.persistance.entities.Endereco;
import com.jhoncout.ClinicaOdonto.persistance.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public Endereco insert(Endereco endereco){
        return repository.save(endereco);
    }

    public List<Endereco> getAllEndereco(){return repository.findAll();}
}
