package com.jhoncout.Aula26.service;

import com.jhoncout.Aula26.dao.FilmeDAO;
import com.jhoncout.Aula26.model.Filme;
import com.jhoncout.Aula26.reposittory.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public Map<Integer, Filme> selectAll(){
        return repository.selectAll();
    }

    public Map<Integer, Filme> selectId(Integer id){
        return repository.selectId(id);
    }

    public String delete(Integer id){
        repository.delete(id);
        return "Filme deletado";
    }

    public Map<Integer, Filme> create(FilmeDAO dao){
        Filme newFilme = new Filme(dao.getNome(),dao.getClassificacao(),dao.getGenero(), dao.getDistribuidora());

        return repository.create(newFilme);
    }

    public Map<Integer,Filme> update(FilmeDAO dao){
        Filme updateFilme = new Filme(dao.getNome(),dao.getClassificacao(),dao.getGenero(), dao.getDistribuidora());
        return repository.update(updateFilme,dao.getId());
    }

}
