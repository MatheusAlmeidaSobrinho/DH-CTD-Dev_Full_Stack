public class CardapioAdulto extends Cardapios{    // n�o tem nada extra alem do principal

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public double acrescimo() {
        return 0;
    }

    @Override
    public void montagem() {
        System.out.println("Montagem padr�o, sem acrescimos.");
    }

    @Override
    public String calculoDeCusto() {
        System.out.println("Custo total, R$ " + getPrecoBase());
        return null;
    }
}
