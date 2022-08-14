package exercicioAula;

import exercicioAula.methodFacade.FacadeDesconto;
import exercicioAula.models.Cartao;
import exercicioAula.models.Produto;

public class Main {
    public static void main(String[] args) {

        FacadeDesconto f1 = new FacadeDesconto();
        // sem o facade teria q instanciar as outras 3 classes Api e criar um metodo abaixo somando elas

        Cartao c1 = new Cartao("4253526694778521", "Star Bank");
        Cartao c2 = new Cartao("1597563258452565", "Nubank");

        Produto p1 = new Produto("Pepsi", "Latas");
        Produto p2 = new Produto("Hamburguer", "Frios");



        System.out.println(f1.calcularDesconto(c1, p1, 13));
        System.out.println(f1.calcularDesconto(c2, p2, 10));
    }
}