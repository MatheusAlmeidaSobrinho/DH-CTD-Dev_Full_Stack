package br.com.malura.tests;

import br.com.malura.models.Aula;
import br.com.malura.models.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _4_TestaCurso {
    public static void main(String[] args) {
        Curso javaDoZero = new Curso("TesteComListsEhMais","ItsMy");

        javaDoZero.adicionaAula(new Aula("Metodos mais usados", 22));
        javaDoZero.adicionaAula(new Aula("Por que usar Collections", 11));
        javaDoZero.adicionaAula(new Aula("Aula praticando List / ArrayList / LinkedList", 33));

        // como possui unmodifiableList essas aulas nao podem ser ordenadas pelo .sort da Collection
        List<Aula> aulasImuntaveis = javaDoZero.getAulas();
        System.out.println(aulasImuntaveis);

        // mas podemos criar uma nova lista e mudar ela
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImuntaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println(javaDoZero.getTempoTotal());

        System.out.println(javaDoZero);

    }
}
