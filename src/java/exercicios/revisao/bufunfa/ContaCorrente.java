package src.java.exercicios.revisao.bufunfa;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numConta, String titular){
        super(titular, numConta);
    }

    @Override 
    public void gerarTaxa(){
        saldo -= 15.90;
    }

    public boolean Sacar(double valor, boolean cobraCPMF){
        if (cobraCPMF) {
            return Sacar(valor + valor * .0038);
        }
        else {
            return Sacar(valor);
        }
    }
}
