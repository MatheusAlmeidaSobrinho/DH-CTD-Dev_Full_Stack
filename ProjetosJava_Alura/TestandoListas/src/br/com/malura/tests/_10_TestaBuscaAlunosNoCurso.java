package br.com.malura.tests;

import br.com.malura.models.Aluno;
import br.com.malura.models.Aula;
import br.com.malura.models.Curso;
import br.com.malura.myException.minhaExcecao;

public class _10_TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaDoZero = new Curso("Teste Collections e Set", "ItsMy");

        javaDoZero.adicionaAula(new Aula("Metodos mais usados", 30));
        javaDoZero.adicionaAula(new Aula("Por que usar Set/List", 10));
        javaDoZero.adicionaAula(new Aula("Aula praticando Set, HashSet, TreeSet", 20));
        javaDoZero.adicionaAula(new Aula("Aula praticando List, LinkedList, ArrayList", 40));

        javaDoZero.matriculaAluno(new Aluno("Tatiane", 2));
        javaDoZero.matriculaAluno(new Aluno("Lucas", 4));
        javaDoZero.matriculaAluno(new Aluno("Matheus", 6));

        Aluno aluno4 = new Aluno("Javinha", 3);
        Aluno aluno5 = new Aluno("Linkinho", 1);
        javaDoZero.matriculaAluno(aluno4);
        javaDoZero.matriculaAluno(aluno5);

        System.out.println(javaDoZero.getNomeAlunos());

        //Usando metodo com utilização do for
        System.out.println("Quem é o aluno com matricula 2:");
        System.out.println(javaDoZero.buscarAlunoPorMatricula(2));
        try {
            System.out.println("Quem é o aluno com matricula 7:");
            System.out.println(javaDoZero.buscarAlunoPorMatricula(7));
        }catch (minhaExcecao ex){
            System.err.println("Erro:" + ex.getMessage());
        }

        //Usando metodo com utilização do Map
        System.out.println(javaDoZero.buscarAlunoPorMatriculaVersaoMap(2));
        System.out.println(javaDoZero.buscarAlunoPorMatriculaVersaoMap(7));


        System.out.println("Buscar por nome do aluno: Javinha");
        System.out.println(javaDoZero.buscaAlunoPorNome("Javinha"));
        try {
        System.out.println("Buscar por nome do aluno: Batatinha");
        System.out.println(javaDoZero.buscaAlunoPorNome("Batatinha"));
        }catch (minhaExcecao ex){
            System.err.println("Erro:" + ex.getMessage());
        }
    }
}
