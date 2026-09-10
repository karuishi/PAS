package src.java.exercicios.revisao.bufunfa;

public class Conta {
    protected int numConta;
    protected String titular;
    protected double saldo;

    Conta(String titular, int numConta){
        this.titular = titular;
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean Sacar(double valor){
        if(valor < saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean Depositar(double valor){
        if(valor < 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean Transferir(Conta contaDestino, double valor){
        boolean retirou = Sacar(valor);
        if(retirou){
            contaDestino.Depositar(valor);
            return true;
        }
        return false;
    }

    public void gerarTaxa(){}
}
