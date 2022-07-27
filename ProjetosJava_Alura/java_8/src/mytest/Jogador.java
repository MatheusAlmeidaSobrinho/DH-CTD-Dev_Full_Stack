package mytest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jogador extends  Equipe {
    private int numeroCamisa;
    private String nomeJogador;

    private boolean isLesionado;
    private boolean isTitular;


    public Jogador(int numeroCamisa, String nomeJogador, boolean isLesionado, boolean isTitular) {
        super(" ");
        if (nomeJogador == null || nomeJogador.equals("")) {
            throw new MyException("Nome do Jogador não pode ser nulo ou vazio");
        }
        this.nomeJogador = nomeJogador;
        this.numeroCamisa = numeroCamisa;
        this.isLesionado = isLesionado;
        this.isTitular = isTitular;

    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public boolean isLesionado() {
        return isLesionado;
    }

    public boolean isTitular() {
        return isTitular;
    }

    @Override
    public String toString() {
        return "Jogador: " + getNomeJogador() + ", camisa:" + getNumeroCamisa();
    }
}
