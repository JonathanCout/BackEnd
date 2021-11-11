package com.jhoncout.integradoraaula19.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String numero, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
}
