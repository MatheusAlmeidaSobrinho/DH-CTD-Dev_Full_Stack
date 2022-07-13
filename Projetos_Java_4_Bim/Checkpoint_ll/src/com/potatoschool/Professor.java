package com.potatoschool;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa { // Estendendo por herança a classe mãe Pessoa

    private List<Aluno> listaAluno = new ArrayList<>();

    public Professor(String nome, String email, int registro) throws ExcecaoPessoa {
        super(nome, email, registro);
    }

    public void adicionaAluno(Aluno aluno) {
        listaAluno.add(aluno);
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    @Override
    public String toString() {
        return "Professor: " + this.getNome() + ", Registro: " + this.getRegistro();
    }
}
