package lista1;

public class Main {

    public static void main(String[] args) {

        MemoriaS hd = new HD("46327", 10, MemoriaS.MB);
        MemoriaS cd = new CD(650, MemoriaS.MB);

        // a) Imprimir Número de Série do HD concatenado com o percentual de perda
        System.out.println("a) Número de Série: " + ((HD) hd).getNumeroSerie() // casting para HD
                + " | Perda: " + hd.getPerda() + "%");

        // b) Imprimir o estado (ABERTO, FECHADO) do CD
        System.out.println("b) Estado do CD: " + ((CD) cd).getEstado()); // casting para CD

        // c) Métodos polimórficos da hierarquia MemoriaS, HD e CD:
        System.out.println("\nc) Métodos polimórficos:");
        System.out.println("   - getPerda()");
        System.out.println("   - getEspacoDisponivelRealKB()");
        System.out.println("   - GravaKB(int) (sobrescrito em CD)");
        System.out.println("   - toString() (sobrescrito em HD e CD)");

        // Polimorfismo com toString()
        System.out.println("\nPolimorfismo com toString():");
        System.out.println(hd);
        System.out.println(cd);

        System.out.println("\nGravando 100KB no CD: " + cd.GravaKB(100));
        System.out.println("Estado do CD após gravação: " + ((CD) cd).getEstado());
        System.out.println("Tentando gravar novamente: " + cd.GravaKB(50));
        System.out.println(cd);
    }
}
