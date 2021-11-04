package model;

public class FuncionarioEfetivo extends Funcionario{

    private Double salarioBase;
    private Integer desconto = 14;
    private Integer beneficio = 5;

    public FuncionarioEfetivo(String nome, String sobrenome, String contaBanc, Tipo tipo, Double salarioBase) {
        super(nome, sobrenome, contaBanc, tipo);
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public Integer getBeneficio() {
        return beneficio;
    }
}
