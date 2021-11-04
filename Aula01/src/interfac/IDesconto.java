package interfac;

import model.Cartao;
import model.Produto;

public interface IDesconto {

    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade);
}
