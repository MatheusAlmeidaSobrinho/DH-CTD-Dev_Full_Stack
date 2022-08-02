public class CardapioInfantil extends Cardapios{

    private String presenteSurpresa; // logo tem custo adicional mais dai fica pro metodo

    public CardapioInfantil(double precoBase) {
        super(precoBase);
    }

    @Override
    public double acrescimo() {
        return getPrecoBase() * 0.2;
    }

    @Override
    public void montagem() {
        System.out.println("Lembrar de colocar o presente surpresa junto!");
        System.out.println("Lembrar do acrescimo sobre o presente! R$ " + acrescimo());
    }

    @Override
    public String calculoDeCusto() {
        double precoTotal = getPrecoBase() + acrescimo();
        System.out.println("Custo total, R$ "+ precoTotal);
        return null;
    }
}
