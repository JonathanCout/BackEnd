package com.digitalhouse.aula15.H2;

public interface IDao<T> {


    public T insert(T t);
    public void delete(String tabela, Integer id);
    public void select (String tabela,Integer id);
    public void selectAll (String tabela);

}
