package br.com.malura.tests;

import br.com.malura.models.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _2_TestadorListaDeAulas {
    public static void main(String[] args) {
        Aula a = new Aula("Testing", 30);
        Aula b = new Aula("Back End", 45);
        Aula c = new Aula("Front End", 15);

        // ArrayList<NomeDaClass/Objeto> nomeListaQueEuQueroNoCasoAulas = nova Lista <> ()

        ArrayList<Aula> aulas = new ArrayList<>(); // tenho meu novo arraylist

        aulas.add(a);
        aulas.add(b);
        aulas.add(c);


        // Um sout já com o toString na class criada ( antes iria retornar a referencia )
        System.out.println("Lista de aulas sem nenhuma filtro!");
        System.out.println(aulas);
        System.out.println();

        // Se eu tentar dar um get na posição vai retornar uma referencia, podemos fazer a busca pelos gets que criamos, como abaixo :
        System.out.println("Lista de aulas com o forEach + Lambda");
        aulas.forEach(meuToString -> {
            System.out.println("Aula: " + meuToString.getTitulo() + ", duração: " + meuToString.getTempo());
        });
        System.out.println();

        // Ou reformular o metodo toString na classe mae do que eu gostaria que aparece-se no lugar da referencia

        //aulas.forEach(tempoAula -> {System.out.println(tempoAula);});
        System.out.println("Lista de aulas com o metodo toString + o forEach + Lambda");
        aulas.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista de aulas ordenação por titulo Usando compareTo");
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println();

        System.out.println("Lista de aulas ordenação por tempo usando o compareTo + Comparator.comparing");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        System.out.println();

        System.out.println("Lista de aulas ordenação direto pelo metodo sort");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
