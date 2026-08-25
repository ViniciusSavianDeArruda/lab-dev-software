package Aula1_Exercicios.Exercicio4;

public class CartaoCreditoPagamento extends MetodoPagamento {

    public CartaoCreditoPagamento() {
        super("Cartão de Crédito");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento com Cartão de Crédito...");
        System.out.println("Valor: R$ " + valor);
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo());
        System.out.println("ID Pagamento: " + getIdPagamento());
    }
}


