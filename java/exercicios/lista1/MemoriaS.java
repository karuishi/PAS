package lista1;

public class MemoriaS {
    public static int BYTE;
    public static int KB;
    public static int MB;
    public static int GB;
    private double total;
    private double utilizadoKB;
    private int unidade;

    public MemoriaS(int newTotal, int newUnidade){
        this.total = newTotal;
        this.unidade = newUnidade;
        this.utilizadoKB = 0;
    }

    public MemoriaS(int newTotal){
        this.total = newTotal;
        this.unidade = KB;
    }
}