package com.digitalhouse.aula05WT.model;

public class Usuario {

    private String username;
    private Tipo tipo;

    public Usuario(String username, Tipo tipo) {
        this.username = username;
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void upgradeConta () {
        this.setTipo(Tipo.PREMIUM);
        System.out.printf("Parabéns %s! Sua conta foi elevada para %s \n",this.getUsername(),this.getTipo());
    }
}
