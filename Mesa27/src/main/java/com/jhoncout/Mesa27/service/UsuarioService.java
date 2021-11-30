package com.jhoncout.Mesa27.service;

import com.jhoncout.Mesa27.persistance.entities.UsuarioEntity;
import com.jhoncout.Mesa27.persistance.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioEntity> listAll(){
        return repository.findAll();
    }
    public String save(UsuarioEntity usuario){
        repository.save(usuario);
        return "Dados salvos com sucesso";
    }
}
