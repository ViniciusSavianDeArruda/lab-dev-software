//3) Crie uma classe Casa com um método calcularPreco(int tamanho) que retorna o preço da casa com base no tamanho em metros quadrados. 
//Sobrecarregue o método calcularPreco() para aceitar um número de quartos e retornar o preço da casa com base no tamanho e no número de quartos.

package Aula1_Exercicios.Exercicio3;

public class Casa {
    
    public double calcularPreco(int tamanho){
        double precoMetroQuadrado = 3000;
        
        return tamanho * precoMetroQuadrado;
    }
    
    public double calcularPreco(int tamanho, int quartos) {
        double precoMetroQuadrado = 3000;
        double valorQuartos = 10000;

        return (tamanho * precoMetroQuadrado) + (quartos * valorQuartos);
    }
    
}
