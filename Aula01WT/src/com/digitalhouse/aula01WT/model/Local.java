package com.digitalhouse.aula01WT.model;

import java.time.LocalDate;

public class Local {
    private LocalDate entrada;
    private LocalDate retorno;
    private String destino;

    public Local(LocalDate entrada, LocalDate retorno, String destino) {
        this.entrada = entrada;
        this.retorno = retorno;
        this.destino = destino;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getRetorno() {
        return retorno;
    }

    public void setRetorno(LocalDate retorno) {
        this.retorno = retorno;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
