import model.FuncionarioContratado;
import model.FuncionarioEfetivo;
import model.Tipo;
import service.PagamentoService;
import service.impl.CalculoSalarialContratado;
import service.impl.CalculoSalarialEfetivo;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, PagamentoService> serviceMap = Map.of("Contratado", new CalculoSalarialContratado(), "Efetivo", new CalculoSalarialEfetivo());

        FuncionarioContratado funcContratado = new FuncionarioContratado("aaa", "BBBBB", "123456789123", Tipo.CONTRATADO,176,35.00);
        FuncionarioEfetivo funcEfetivo = new FuncionarioEfetivo("bbb", "aaaaa", "5145789451321457",Tipo.EFETIVO,2400.35);

        PagamentoService serviceEfet = serviceMap.get("Efetivo");
        serviceEfet.pagar(funcEfetivo);

        PagamentoService serviceCont = serviceMap.get("Contratado");
        serviceCont.pagar(funcContratado);

        System.out.println(funcContratado.getSalarioFinal());
        System.out.println(funcEfetivo.getSalarioFinal());
    }
}
