package src.java.exercicios.revisao.bufunfa;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, int numConta){
        super(titular, numConta);
    }

    @Override 
    public void gerarTaxa(){
        saldo += saldo * .006;
    }
}
