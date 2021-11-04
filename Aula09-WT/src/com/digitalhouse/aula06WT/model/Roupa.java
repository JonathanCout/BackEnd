package com.digitalhouse.aula06WT.model;

public class Roupa {
    private Tamanho tamanho;
    private Tipo tipo;
    private boolean nova;
    private boolean importada;

    public Roupa(Tamanho tamanho, Tipo tipo, boolean nova, boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.nova = nova;
        this.importada = importada;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isNova() {
        return nova;
    }

    public void setNova(boolean nova) {
        this.nova = nova;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho=" + tamanho +
                ", tipo=" + tipo +
                ", nova=" + nova +
                ", importada=" + importada +
                '}';
    }
}
