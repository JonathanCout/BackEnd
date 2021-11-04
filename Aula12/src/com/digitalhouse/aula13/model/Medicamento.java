package com.digitalhouse.aula13.model;

public class Medicamento {

    private Integer id;
    private String codigoNum;
    private String nome;
    private String laboratorio;
    private Integer quantidade;
    private Double preco;

    public Medicamento(Integer id, String codigoNum, String nome, String laboratorio, Integer quantidade, Double preco) {
        this.id = id;
        this.codigoNum = codigoNum;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoNum() {
        return codigoNum;
    }

    public void setCodigoNum(String codigoNum) {
        this.codigoNum = codigoNum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", codigoNum='" + codigoNum + '\'' +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
