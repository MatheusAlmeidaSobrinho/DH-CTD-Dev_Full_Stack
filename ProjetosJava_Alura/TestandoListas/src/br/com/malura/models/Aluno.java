package br.com.malura.models;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null || nome.equals("")) {
            throw new NullPointerException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    // Reescreveu o equals, tem que reescrever o hashCode
    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Nome aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }
}
