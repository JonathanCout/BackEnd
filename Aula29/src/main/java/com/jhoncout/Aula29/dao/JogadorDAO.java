package com.jhoncout.Aula29.dao;

public class JogadorDAO {

    private String nome;
    private String posicao;
    private String numero;
    private Integer treinadorId;
    private Integer equipeId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getTreinadorId() {
        return treinadorId;
    }

    public void setTreinadorId(Integer treinadorId) {
        this.treinadorId = treinadorId;
    }

    public Integer getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Integer equipeId) {
        this.equipeId = equipeId;
    }
}
