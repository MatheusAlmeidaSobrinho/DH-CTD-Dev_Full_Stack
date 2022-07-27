package mytest;

import java.util.Comparator;
import java.util.List;

public class Testando {
    public static void main(String[] args) {
        Equipe batatinha = new Equipe("OsPotatos");

        Jogador player1 = new Jogador(11,"Alfa",true,true);
        Jogador player2 = new Jogador(3,"Beta",false,true);
        Jogador player5 = new Jogador(10,"Lambda",false,true);
        Jogador player4 = new Jogador(9,"Delta",false,true);
        Jogador player3 = new Jogador(6,"Gama",true,true);
        Jogador player6 = new Jogador(15,"Pi",false,false);
        Jogador player7 = new Jogador(21,"Xis",true,false);
        Jogador player8 = new Jogador(17,"Kraken",false,false);


        batatinha.adicionarJogador(player1);
        batatinha.adicionarJogador(player2);
        batatinha.adicionarJogador(player3);
        batatinha.adicionarJogador(player4);
        batatinha.adicionarJogador(player5);
        batatinha.adicionarJogador(player6);
        batatinha.adicionarJogador(player7);
        batatinha.adicionarJogador(player8);

//        batatinha.getTodosJogadores().sort(Comparator.comparing(j -> j.getNumeroCamisa()));
//        System.out.println(batatinha.getTodosJogadores());
//
//        batatinha.getTodosJogadores().forEach(j -> System.out.println(j));

        System.out.println("Mostra jogadores ordem Nº camisa:");
        batatinha.getTodosJogadores().sort(Comparator.comparing(j -> j.getNumeroCamisa()));
        batatinha.getTodosJogadores().forEach(j -> System.out.println(j.getNomeJogador()));
        System.out.println();

        System.out.println("Mostra nome dos jogadores titulares:");
        batatinha.getTodosJogadores().stream().filter(j -> j.isTitular()).forEach( j -> System.out.println(j.getNomeJogador()));
        System.out.println();

        System.out.println("Mostra nº dos jogadores lesionados");
        batatinha.getTodosJogadores().stream().filter(j -> j.isLesionado()).forEach(j -> System.out.println(j.getNumeroCamisa()));
        System.out.println();

        System.out.println("Quantidade de jogadores lesionados:");
        System.out.println(batatinha.getQuantidadeJogadoresLesionados());
        System.out.println();

        System.out.println("Jogadores não titulares:");
        batatinha.jogadoresNaoTitulares();
        System.out.println();

        int ue = batatinha.compare(player5,player7);

        if(ue > 0){
            System.out.println("Nº primeiro jogador é maior que o nº do segundo jogador");
        }
        if(ue < 0){
            System.out.println("Nº segundo jogador é maior que o nº do primeiro jogador");
        }
        if(ue == 0){
            System.out.println("Nº são iguais");
        }
    }
}
