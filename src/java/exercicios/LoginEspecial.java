package java.exercicios;

// b)
public class LoginEspecial extends Login{
    public LoginEspecial(String nome, String senha){
        super(nome, senha);
    }
    private String dica = "Basta ler, irmão.";

    public String getDica(){
        return dica;
    }

    public void setDica(String dica){
        this.dica = dica;
    }
}