package mytest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipe implements Comparator<Jogador> {
    private String nomeEquipe;
    private List<Jogador> todosJogadores = new ArrayList<Jogador>();

    private int qntJogadores;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Equipe() {

    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }


    public List<Jogador> getTodosJogadores() {
        return todosJogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.todosJogadores.add(jogador);
    }

    public int getQntJogadores() {
        return qntJogadores;
    }

    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for (Jogador jogadoresLesionados: todosJogadores) {
            if (jogadoresLesionados.isLesionado()){
                contador++;
            }
        }
        return contador;

    }

    public void jogadoresNaoTitulares(){
        for (Jogador jogadoresNaoTitulares: todosJogadores) {
            if (!jogadoresNaoTitulares.isTitular()){
                System.out.println(jogadoresNaoTitulares.getNomeJogador());
            }
        }
    }

    @Override
    public int compare(Jogador j1, Jogador j2) {
        if (j1.getNumeroCamisa() < j2.getNumeroCamisa())
            return -1;
        if (j1.getNumeroCamisa() > j2.getNumeroCamisa())
            return 1;
        return 0;
        //return Integer.compare(j1.getNumeroCamisa(), j2.getNumeroCamisa());
    }
}
