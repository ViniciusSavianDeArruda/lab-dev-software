
package Aula1_Exercicios.Exercicio4;
import java.util.Random;


public abstract class MetodoPagamento {
    private String nomeMetodo;
    private int idPagamento;

    public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        
        Random random = new Random();
        this.idPagamento = random.nextInt(10000);
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }
    
    public abstract void processaPagamento(double valor);

    public abstract void mostraDetalhesPagamento();
}
