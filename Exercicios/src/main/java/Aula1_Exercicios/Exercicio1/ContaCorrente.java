package Aula1_Exercicios.Exercicio1;

public class ContaCorrente {
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void definirSaldoInicial(float valor){
        saldo = valor;
    }
    
    public void depositar(float valor){
        saldo +=valor;
        
    }
    
    public boolean sacar(float valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
