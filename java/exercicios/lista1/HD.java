package lista1;

public class HD extends MemoriaS {
    private String numeroSerie;

    public HD(String newNumeroSerie, int newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.numeroSerie = newNumeroSerie;
    }

    @Override
    public double getPerda() {
        return getConverteKB(total) / 10240.0 / 100.0;
    }

    @Override
    public double getEspacoDisponivelRealKB() {
        return getEspacoDisponivelKB() * (1 - getPerda());
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "HD Número de Serie " + numeroSerie + " "
             + super.toString();
    }
}
