package br.com.malura.tests;

import java.util.HashSet;
import java.util.Set;

public class _5_TestaAluno {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());

        //3) tente adicionar um aluno que existe
        boolean alunoAddComSucesso = alunos.add("Paulo");
        System.out.println("O aluno Paulo foi adicionado?" + alunoAddComSucesso);

        boolean alunoAddComSucesso2 = alunos.add("Matheus");
        System.out.println("O aluno Matheus foi adicionado?" + alunoAddComSucesso2);

        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());


        //tente imprimir os alunos usando foreach
        for (String aluno: alunos) {
            System.out.println(aluno);
        }

    }
}
