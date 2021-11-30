package com.jhoncout.Integradora28.service;

import com.jhoncout.Integradora28.persistance.entities.ProdutoEntity;
import com.jhoncout.Integradora28.persistance.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoEntity> getAll(){
        return repository.findAll();
    }

    public String save(ProdutoEntity produto){
        repository.save(produto);
        return "Produto salvo com sucesso";
    }

    public String delete(Integer id){
        repository.delete(repository.getById(id));
        return "Produto deletado com sucesso";
    }

    public ProdutoEntity update(ProdutoEntity produto){
        Optional<ProdutoEntity> produtoUpdated = repository.findById(produto.getId());
        produtoUpdated.get().setQuantidade(produto.getQuantidade());
        produtoUpdated.get().setDescricao(produto.getDescricao());

        repository.save(produtoUpdated.get());
        return produtoUpdated.get();
    }
}
