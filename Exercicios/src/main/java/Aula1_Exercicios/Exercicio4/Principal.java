package Aula1_Exercicios.Exercicio4;

import Aula1_Exercicios.Exercicio4.PayPalPagamento;
import Aula1_Exercicios.Exercicio4.PIXPagamento;
import Aula1_Exercicios.Exercicio4.MetodoPagamento;
import Aula1_Exercicios.Exercicio4.CartaoCreditoPagamento;

public class Principal {
    public static void main(String[] args) {
        
        MetodoPagamento cartao = new CartaoCreditoPagamento();
        MetodoPagamento paypal = new PayPalPagamento();
        MetodoPagamento pix = new PIXPagamento();

        System.out.println("Cartão de Crédito:");
        cartao.processaPagamento(250.00);
        cartao.mostraDetalhesPagamento();

        System.out.println();

        System.out.println("PayPal");
        paypal.processaPagamento(150.00);
        paypal.mostraDetalhesPagamento();

        System.out.println();

        System.out.println("PIX");
        pix.processaPagamento(80.00);
        pix.mostraDetalhesPagamento();
    }       
}
