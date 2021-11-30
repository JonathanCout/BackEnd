package com.jhoncout.Aula23.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {

    private String nome;
    private String sobrenome;
    private String rg;
    private String email;

    public Paciente(String nome, String sobrenome, String rg, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.email = email;
    }
}
