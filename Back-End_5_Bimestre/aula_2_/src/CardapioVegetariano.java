public class CardapioVegetariano extends Cardapios{
    private String embalagemEspecial; // custo extra mais dai é no metodo

    public CardapioVegetariano(double precoBase) {
        super(precoBase);
    }

    @Override
    public double acrescimo() {
        return getPrecoBase() * 0.02;
    }

    @Override
    public void montagem() {
        System.out.println("Lembrar de montar com a embalagem surpresa!");
        System.out.println("Lembrar do acrescimo sobre a embalagem! R$ " + acrescimo());
        System.out.println("Lembrar do acrescimo sobre os temperos! R$ " + precoExtraTemperos());
    }

    @Override
    public String calculoDeCusto() {
        double precoTotal = getPrecoBase() + acrescimo() + precoExtraTemperos();
        System.out.println("Custo total, R$ " + precoTotal);;
        return null;
    }

    public double precoExtraTemperos(){  // nao da pra utilizar no teste, deveria ser um atributo, ou metodo acima funfar
        return getPrecoBase() * 0.01;
    }


}
