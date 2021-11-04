package service;

import model.Funcionario;
import model.Tipo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class PagamentoService {

    public void pagar (Funcionario funcionario) {
        funcionario.setSalarioFinal(calcularSalario(funcionario));
        Double salario = funcionario.getSalarioFinal();

        DecimalFormat formato = new DecimalFormat("#.##");
        formato.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
        salario = Double.valueOf(formato.format(salario));

        System.out.println(depositarSalario(funcionario.getContaBanc(),salario));
        System.out.println(emitirComprovante(funcionario.getTipo()));
    }
    private String depositarSalario (String conta, Double salarioFinal) {
        return "Depósito do salário " + salarioFinal + " efetuado na conta " + conta;
    }

    private String emitirComprovante (Tipo tipo) {
        if (tipo == Tipo.CONTRATADO) {
            return "Recibo enviado por email";
        }else if (tipo == Tipo.EFETIVO) {
            return "Recibo impresso com sucesso!";
        }

        return "Erro ao emitir recibo";
    }

    protected abstract Double calcularSalario(Funcionario funcionario);

}
