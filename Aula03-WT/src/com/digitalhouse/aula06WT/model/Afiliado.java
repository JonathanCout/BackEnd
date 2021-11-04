package com.digitalhouse.aula06WT.model;

import java.time.LocalDate;

public class Afiliado extends Vendedor{


    public Afiliado(String nome) {
        super(nome);
    }

    @Override
    public void vender() {
        this.darPontos(15);
    }
}
