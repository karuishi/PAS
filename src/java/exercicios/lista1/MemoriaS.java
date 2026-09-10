package lista1;

public abstract class MemoriaS {
    public static final int BYTE = 0;
    public static final int KB = 1;
    public static final int MB = 2;
    public static final int GB = 3;

    protected double total;
    protected double utilizadoKB;
    protected int unidade;

    public MemoriaS(int newTotal, int newUnidade) {
        this.total = newTotal;
        this.unidade = newUnidade;
        this.utilizadoKB = 0;
    }

    public MemoriaS(int newTotal) {
        this(newTotal, KB);
    }

    public abstract double getPerda();
    public abstract double getEspacoDisponivelRealKB();

    protected double getEspacoDisponivelKB() {
        return getConverteKB(total) - utilizadoKB;
    }

    public boolean GravaKB(int newTamanho) {
        if (getEspacoDisponivelRealKB() >= newTamanho) {
            utilizadoKB += newTamanho;
            return true;
        }
        return false;
    }

    protected double getConverteKB(double valor) {
        switch (unidade) {
            case BYTE: return valor / 1024.0;
            case KB:   return valor;
            case MB:   return valor * 1024.0;
            case GB:   return valor * 1024.0 * 1024.0;
            default:   return valor;
        }
    }

    public String getUnidade() {
        switch (unidade) {
            case BYTE: return "BYTE";
            case KB:   return "KB";
            case MB:   return "MB";
            case GB:   return "GB";
            default:   return "DESCONHECIDA";
        }
    }

    public double getPercentualDisponivel() {
        double totalKB = getConverteKB(total);
        if (totalKB == 0) return 0;
        return (getEspacoDisponivelRealKB() / totalKB) * 100;
    }

    @Override
    public String toString() {
        return "Percentual Disponível " + getPercentualDisponivel() + "% "
             + "Espaço Total " + getConverteKB(total) + "KB "
             + "Espaço Disponível Real " + getEspacoDisponivelRealKB() + "KB "
             + "Perda " + getPerda() + "%";
    }
}
