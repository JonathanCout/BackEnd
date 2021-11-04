package com.digitalhouse.aula01WT.model;

import java.time.LocalDate;

public class Hotel extends Local{

    private String origem;

    public Hotel(LocalDate entrada, LocalDate retorno, String destino, String origem) {
        super(entrada, retorno, destino);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
