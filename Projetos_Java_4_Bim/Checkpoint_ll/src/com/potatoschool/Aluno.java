package com.potatoschool;

public class Aluno extends Pessoa { // Extendendo por herança a classe mãe Pessoa
    public Aluno(String nome, String email, int registro) throws ExcecaoPessoa { // Construtor da classe Aluno já dando throws a nossa exceção
        super(nome, email, registro);
    }

    public void cadastrarAluno(Professor professor) { // metodo que cadastra o aluno a lista professor
        professor.adicionaAluno(this);
    }

    public void removerAluno(Professor professor) { // metodo que cadastra o aluno a lista professor
        professor.removeAluno(this);
    }

    public String toString() { // metodo toString
        return " Aluno: " + this.getNome() + ", Registro: " + this.getRegistro();
    }
}


