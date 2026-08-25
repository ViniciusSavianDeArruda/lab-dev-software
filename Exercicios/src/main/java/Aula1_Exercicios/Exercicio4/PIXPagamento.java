package Aula1_Exercicios.Exercicio4;

public class PIXPagamento extends MetodoPagamento {

    public PIXPagamento() {
        super("Pix");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento via PIX...");
        System.out.println("Valor: R$ " + valor);
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo());
        System.out.println("ID Pagamento: " + getIdPagamento());
    }
}