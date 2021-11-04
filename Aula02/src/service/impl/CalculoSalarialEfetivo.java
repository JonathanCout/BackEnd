package service.impl;

import model.Funcionario;
import model.FuncionarioEfetivo;
import service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {

    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalarioBase();
        salario -= (salario * efetivo.getDesconto()/100);
        salario += (salario * efetivo.getBeneficio()/100);
        return salario;
    }
}
