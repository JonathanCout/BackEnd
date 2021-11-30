package com.jhoncout.Aula26.reposittory;

import com.jhoncout.Aula26.dao.FilmeDAO;
import com.jhoncout.Aula26.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FilmeRepository implements IRepository<Filme> {

    public static Map<Integer, Filme> filmeMap = new HashMap<>();

    @Override
    public Map<Integer, Filme> create(Filme filme) {
        Integer id = filmeMap.size() +1;
        filmeMap.put(id,filme);

        Map<Integer,Filme> create = new HashMap<>();
        create.put(id,filmeMap.get(id));

        return create;
    }

    @Override
    public Map<Integer, Filme> update(Filme filme, Integer id) {
        Filme updateFilme = filmeMap.get(id);
        updateFilme.setClassificacao(filme.getClassificacao());
        updateFilme.setDistribuidora(filme.getDistribuidora());

        Map<Integer,Filme> update = new HashMap<>();
        update.put(id,filmeMap.get(id));
        return update;
    }

    @Override
    public Map<Integer,Filme> selectAll() {
        return filmeMap;
    }

    @Override
    public Map<Integer, Filme> selectId(Integer id) {
        Map<Integer,Filme> select = new HashMap<>();
        select.put(id,filmeMap.get(id));
        return select;
    }

    @Override
    public void delete(Integer id) {
        filmeMap.remove(id);
    }
}
