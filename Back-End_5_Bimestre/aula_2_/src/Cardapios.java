public abstract class Cardapios {

    private double precoBase;
//    private double acrescimo;
//    private String montagem;
//    private double calculoPrecoVenda;


    public Cardapios(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }


    public abstract double acrescimo();
    public abstract void montagem();
    public abstract String calculoDeCusto();
    // nao deveria ser String, quebra a utilidade no teste
    // mais ajuda pra deixar visual a ideia, mais quebra a utilidade, num caso real deveria ser feito com double

    @Override
    public String toString() {
       return "Preço base: " + getPrecoBase();
    }
}
