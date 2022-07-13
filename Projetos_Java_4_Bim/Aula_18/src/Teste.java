import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Time brazil = new Time("CLP");
        Jogador j1 = new Jogador("Potato","Goleiro",1);
        Jogador j2 = new Jogador("Alfa","Atacante",5);
        Jogador j3 = new Jogador("Beta","Atacante",6);
        Jogador j4 = new Jogador("Creta","Atacante",7);
        Jogador j5 = new Jogador("Detra","Meio-campo",18);
        Jogador j6 = new Jogador("Fetra","Meio-campo",19);
        Jogador j7 = new Jogador("Hydra","Defensor",22);
        Jogador j8 = new Jogador("Hello","Defensor",33);

        brazil.addJogador(j1);
        brazil.addJogador(j2);
        brazil.addJogador(j3);
        brazil.addJogador(j4);
        brazil.addJogador(j5);
        brazil.addJogador(j6);
        brazil.addJogador(j7);
        brazil.addJogador(j8);

        // ESSE AQUI SERIA A FORMA PARA NAO TER Q DAR ADD SEPARADAMENTE NOS JOGADORES
        // ArrayList<Jogador> jogadoresPraAdicionar = new ArrayList<Jogador>();
        //Collections.addAll(jogadoresPraAdicionar, j1, j2, j3, j4, j5, j6, j7, j8);
        // brazil.addJogador(jogadoresPraAdicionar);

        System.out.println(brazil.obterReservas());
        System.out.println(brazil.quantidadeDeJogadores("Atacante"));


    }
}
