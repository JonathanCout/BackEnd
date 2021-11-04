package impl;

import exapi.ApiCartao;
import exapi.ApiProduto;
import exapi.ApiQuantidade;
import interfac.IDesconto;
import model.Cartao;
import model.Produto;

public class ServiceDesconto implements IDesconto {

    private ApiCartao apiCartao = new ApiCartao();
    private ApiProduto apiProduto = new ApiProduto();
    private ApiQuantidade apiQuantidade = new ApiQuantidade();

    @Override
    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade) {
        return apiCartao.checkDesconto(cartao.getBanco()) + apiProduto.checkDesconto(produto.getTipo()) + apiQuantidade.checkDesconto(quantidade);
    }
}
