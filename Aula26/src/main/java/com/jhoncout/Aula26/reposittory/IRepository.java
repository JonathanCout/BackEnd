package com.jhoncout.Aula26.reposittory;

import java.util.Map;

public interface IRepository <M> {

    Map<Integer,M> create(M model);
    Map<Integer,M> update (M model,Integer id);
    Map<Integer,M> selectAll();
    Map<Integer,M> selectId(Integer id);
    void delete(Integer id);

}
