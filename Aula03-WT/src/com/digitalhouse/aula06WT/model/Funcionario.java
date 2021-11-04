package com.digitalhouse.aula06WT.model;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends Vendedor{

    private LocalDate contratacao;

    public Funcionario(String nome, LocalDate contratacao) {
        super(nome);
        this.contratacao = contratacao;
    }

    @Override
    public void vender() {
        this.darPontos(5);
    }

    public void tornarAfiliado(){
        this.darPontos(10);
    }

    public void calcularAntiguidade(){
        this.darPontos(Period.between(this.contratacao, LocalDate.of(2021, 10, 26)).getYears() * 5);
    }

}
