public class Testando {
    public static void main(String[] args) {
        Cardapios c1 = new CardapioAdulto(100);
        Cardapios c2 = new CardapioInfantil(100);
        Cardapios c3 = new CardapioVegetariano(100);

        c1.montagem();
        c1.calculoDeCusto();

        System.out.println();

        c2.montagem();
        c2.calculoDeCusto();

        System.out.println();

        c3.montagem();
        c3.calculoDeCusto();
    }

}
