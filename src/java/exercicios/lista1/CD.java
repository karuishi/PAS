package lista1;

public class CD extends MemoriaS {
    public static final int ABERTO  = 0;
    public static final int FECHADO = 1;
    private int estado;

    public CD(int newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.estado = ABERTO;
    }

    @Override
    public double getPerda() {
        return 0.98;
    }
    
    @Override
    public double getEspacoDisponivelRealKB() {
        return getEspacoDisponivelKB() * getPerda();
    }

    @Override
    public boolean GravaKB(int newTamanho) {
        if (estado == ABERTO) {
            boolean gravou = super.GravaKB(newTamanho);
            if (gravou) {
                estado = FECHADO;
            }
            return gravou;
        }
        return false;
    }

    public String getEstado() {
        if (estado == ABERTO) {
            return "ABERTO";
        }
        return "FECHADO";
    }

    @Override
    public String toString() {
        return "CD Estado " + getEstado() + " "
             + super.toString();
    }
}
