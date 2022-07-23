package br.com.malura.models;

import java.util.*;

public class Curso {
    private String nome;
    private String professor;
    private List<Aula> aulas = new LinkedList<Aula>();

    private Set<Aluno> alunos = new HashSet<Aluno>();

    public Curso(String nomeCurso, String professor) {
        this.nome = nomeCurso;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
        //return aulas;
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }


    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal+= aula.getTempo();
        }
        return tempoTotal;
    }

    public int getSomaMatriculas() {
        int totalMatricula = 0;
        for (Aluno aluno: alunos) {
            totalMatricula+= aluno.getNumeroMatricula();
        }
        return totalMatricula;
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", ministrado por: " + this.professor + ", duração: " + getTempoTotal() + "]"+
                "\nPossui as seguintes aulas:\n" + this.getAulas();
    }

    public boolean alunoEstaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public String getNomeAlunos() {
        String listaNomeAlunos = "";
        for (Aluno aluno: alunos) {
            listaNomeAlunos+= "[" + aluno.getNome() + "] ";
        }
        return listaNomeAlunos;
    }
}
