package Aula1_Exercicios.Exercicio1;

import Aula1_Exercicios.Exercicio1.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo:" + novaConta.getSaldo());
        
        novaConta.sacar(500);
        novaConta.depositar(50);
        
        System.out.println("Valor final:" + novaConta.getSaldo());
    }
    
}
