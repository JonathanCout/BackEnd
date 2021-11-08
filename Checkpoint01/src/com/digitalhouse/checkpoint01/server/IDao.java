package com.digitalhouse.checkpoint01.server;

public interface IDao<O> {

    public void dropTable();
    public void insert(O o);
    public void delete(Integer id);
    public void select(Integer id);
    public void selectAll();

}
