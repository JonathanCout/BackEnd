package com.digitalhouse.checkpoint01.model;

public class Dentista {

    private int id;
    private String matricula;
    private String nome;
    private String sobrenome;

    public Dentista(String matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
