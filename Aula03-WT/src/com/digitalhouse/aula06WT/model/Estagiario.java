package com.digitalhouse.aula06WT.model;

public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public void vender() {
        this.darPontos(5);
    }
}
