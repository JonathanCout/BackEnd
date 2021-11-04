import impl.ServiceDesconto;
import model.Cartao;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("4567123465874513", "Star Bank");
        Produto produto = new Produto("Bala", "Doce");

        ServiceDesconto service = new ServiceDesconto();

        System.out.println(service.calcularDesconto(cartao, produto, 13));
    }
}
