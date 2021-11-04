package com.digitalhouse.aula06WT.model;

public abstract class Vendedor {

    private String nome;
    private Integer pontos = 0;
    private Categoria categoria;
    private CategoriaEstagiario categoriaEstagiario;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void darPontos(Integer pontos){
        this.pontos += pontos;
    }

    public String mostrarCategoria(){
        if(this.getPontos() < 20 ) {
            this.setCategoria(Categoria.NOVATO);
        } else if(this.getPontos() >= 20 && this.getPontos() <= 30) {
            this.setCategoria(Categoria.APRENDIZ);
        } else if(this.getPontos() >= 31 && this.getPontos() <= 40) {
            this.setCategoria(Categoria.BOM);
        } else {
            this.setCategoria(Categoria.MESTRE);
        }
        return String.format("O(a) Vendedor(a) %s possui %s pontos e está na categoria %s", this.getNome(),this.getPontos(),this.getCategoria());
    }
    public abstract void vender();

    public String mostrarCategoriaEstagiario(){
        if(this.getPontos() < 50 ) {
            this.setCategoriaEstagiario(CategoriaEstagiario.NOVATO);
        } else {
            this.setCategoriaEstagiario(CategoriaEstagiario.EXPERIENTE);
        }
        return String.format("O(a) Estagiário(a) %s possui %s pontos e está na categoria %s", this.getNome(),this.getPontos(),this.getCategoriaEstagiario());
    }

    public CategoriaEstagiario getCategoriaEstagiario() {
        return categoriaEstagiario;
    }

    public void setCategoriaEstagiario(CategoriaEstagiario categoriaEstagiario) {
        this.categoriaEstagiario = categoriaEstagiario;
    }
}

