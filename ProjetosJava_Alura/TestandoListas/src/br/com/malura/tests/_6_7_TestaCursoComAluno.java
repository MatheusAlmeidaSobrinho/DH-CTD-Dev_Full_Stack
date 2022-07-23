package br.com.malura.tests;

import br.com.malura.models.Aluno;
import br.com.malura.models.Aula;
import br.com.malura.models.Curso;

import java.util.*;

public class _6_7_TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaDoZero = new Curso("Teste Collections e Set","ItsMy");

        javaDoZero.adicionaAula(new Aula("Metodos mais usados", 22));
        javaDoZero.adicionaAula(new Aula("Por que usar Set", 11));
        javaDoZero.adicionaAula(new Aula("Aula praticando Set / HashSet / Collections", 33));

        javaDoZero.matriculaAluno(new Aluno("Tatiane", 26));
        javaDoZero.matriculaAluno(new Aluno("Lucas", 7));
        javaDoZero.matriculaAluno(new Aluno("Matheus", 14));

        Aluno aluno4 = new Aluno("Javinha",1);
        javaDoZero.matriculaAluno(aluno4);

        System.out.println(javaDoZero.getAlunos()); // antes do toString retornava as referencias

        // antes do toString eu teria que fazer aluno.getNome() ou aluno.getMatricula, literalmente criar um toString
        javaDoZero.getAlunos().forEach(aluno -> {System.out.println(aluno);});

        // antes do java 8 usavamos o foreach assim:
//        for(String letra: conjunto) {
//            System.out.println(letra);
//        }

        // e até antes no java 5 era assim:
//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Iterator<Aluno> iterador = alunos.iterator();
//
//        while (iterador.hasNext()) {
//            System.out.println(iterador.next());
//        }

        //System.out.println(javaDoZero.alunoEstaMatriculado(aluno4));

        System.out.println("O aluno " + aluno4.getNome() + " está matriculado?");
        System.out.println(javaDoZero.alunoEstaMatriculado(aluno4));

        Aluno javinha = new Aluno("Javinha", 1);
        System.out.println("E esse Javinha, está matriculado?");
        System.out.println(javaDoZero.alunoEstaMatriculado(javinha));

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(aluno4.equals(javinha));

        //Só é possivel que ambos sejam iguais por que o metodo equals e hashCode foram implementados corretamente
        //buscando assim no numero magico certo e realizando o equals conforme eu estipulei

        //Mais isso é só no Set certo? sim e não, para List não tem problema desde que vc não use a comparação,
        //mais em ambos é recomendado fazer.


        //Exercicio Refazendo a moda antiga modulo 6
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

        letras.forEach(letra -> {System.out.println(letra);}); // forma de realizar foreach java 8

        Iterator<String> iterador = letras.iterator(); // mais antigo q minha vó
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
