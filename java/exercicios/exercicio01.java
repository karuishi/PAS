package java.exercicios;

public class exercicio01 {
    
    public static void main(String[] args){
        // a)
        Login usuario = new Login("eduardo", "123");
        // c)
        Login user = new LoginEspecial("eduardo", "123");

        System.out.println(usuario.verificaLogin("carlos", "123"));
        System.out.println(((LoginEspecial) user).getDica()); // Casting

    }
}
