package src.java.exercicios.revisao.bufunfa;

public class main {
    public static void main(String[] args){
        ContaPoupanca cp = new ContaPoupanca("Eduardo", 123);
        cp.Depositar(1000);
        cp.gerarTaxa();
        cp.Sacar(800);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());

        ContaCorrente cc = new ContaCorrente(123, "Eduardo");
        cc.Depositar(1000);
        cc.gerarTaxa();
        cc.Sacar(800);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
    }
}
    