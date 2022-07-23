package br.com.malura.tests;
import java.util.Collections;
import java.util.ArrayList;

public class _1_TestandoListas {

    public static void main(String[] args) {


        // Adicionando elementos a uma lista
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Desenvolvendo em Java";
        String aula5 = "Arrasando em Array / ArrayList";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        aulas.add(aula5);

        System.out.println(aulas);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Removendo elementos de uma lista
        aulas.remove(0);
        aulas.remove(aula2);
        System.out.println(aulas);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Acessando elementos
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        String terceiraAula = aulas.get(2);
        System.out.println("A terceira aula é " + terceiraAula);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Percorrendo uma lista
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Percorrendo novamente a lista
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Percorrendo a lista mais agora utilizando Java 8
        aulas.forEach(aula -> {System.out.println("Percorrendo: \nAula: " + aula);});
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Ordenando a lista (Utilizando Collections)
        Collections.sort(aulas);
    }

}
