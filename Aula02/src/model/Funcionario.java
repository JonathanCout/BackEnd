package model;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String contaBanc;
    private Tipo tipo;
    private Double salarioFinal;

    public Funcionario(String nome, String sobrenome, String contaBanc, Tipo tipo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaBanc = contaBanc;
        this.tipo = tipo;
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

    public String getContaBanc() {
        return contaBanc;
    }

    public void setContaBanc(String contaBanc) {
        this.contaBanc = contaBanc;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}
