package com.digitalhouse.aula13.dao;

public interface IDao<T>{

    public T insert(T t);
    public void delete(Integer id);
    public void select(Integer id);
    public void selectAll(Integer id);
    public void selectCod(String codigo);

}
