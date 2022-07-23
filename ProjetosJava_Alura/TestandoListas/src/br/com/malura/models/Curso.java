package br.com.malura.models;

import br.com.malura.myException.minhaExcecao;

import java.util.*;

public class Curso {
    private String nome;
    private String professor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno); // Usando map
        // toda vez q um aluno for matriculado, ele é associado entre o numero de matricula para cada aluno
    }


    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public int getSomaMatriculas() {
        int totalMatricula = 0;
        for (Aluno aluno : alunos) {
            totalMatricula += aluno.getNumeroMatricula();
        }
        return totalMatricula;
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", ministrado por: " + this.professor + ", duração: " + getTempoTotal() + "]" +
                "\nPossui as seguintes aulas:\n" + this.getAulas();
    }

    public boolean alunoEstaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public String getNomeAlunos() {
        String listaNomeAlunos = "";
        for (Aluno aluno : alunos) {
            listaNomeAlunos += "[" + aluno.getNome() + "] ";
        }
        return listaNomeAlunos;
    }

    public Aluno buscarAlunoPorMatricula(int numeroMatricula) {
        for (Aluno aluno : alunos) {
            if (numeroMatricula == aluno.getNumeroMatricula()) {
                return aluno;
            }
        }
        throw new minhaExcecao("Busca por matricula:[" + numeroMatricula + "] do aluno invalida ou não encontrada");
    }

    public Aluno buscarAlunoPorMatriculaVersaoMap(int numeroMatricula) {
        if (!matriculaParaAluno.containsKey(numeroMatricula)) {
            throw new minhaExcecao("Busca por matricula:[" + numeroMatricula + "] do aluno invalida ou não encontrada");
        }
        return matriculaParaAluno.get(numeroMatricula);
    }


    public Aluno buscaAlunoPorNome(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (nomeAluno == aluno.getNome()) {
                return aluno;
            }
        }
        throw new minhaExcecao("Busca por nome [" + nomeAluno + "] do aluno invalido ou não encontrado");
    }
}
