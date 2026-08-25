package Aula1_Exercicios.Exercicio3;

import Aula1_Exercicios.Exercicio3.Casa;

public class Principal {
    public static void main(String[] args) {
        Casa casa = new Casa();

        double preco = casa.calcularPreco(100);
        System.out.println("Preço da casa: R$ " + preco);

        double preco2 = casa.calcularPreco(100, 3);
        System.out.println("Preço da casa com quartos: R$ " + preco2);
    }
    
}
