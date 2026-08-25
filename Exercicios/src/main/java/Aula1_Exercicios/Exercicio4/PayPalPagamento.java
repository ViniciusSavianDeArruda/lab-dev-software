package Aula1_Exercicios.Exercicio4;

import Aula1_Exercicios.Exercicio4.MetodoPagamento;

public class PayPalPagamento extends MetodoPagamento {

    public PayPalPagamento() {
        super("PayPal");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento com PayPal...");
        System.out.println("Valor: R$ " + valor);
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo());
        System.out.println("ID Pagamento: " + getIdPagamento());
    }
}