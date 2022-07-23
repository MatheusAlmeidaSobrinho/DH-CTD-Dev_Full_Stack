package br.com.malura.tests;

import br.com.malura.models.Aula;
import br.com.malura.models.Curso;
import java.util.List;

public class _3_TestaCurso {
    public static void main(String[] args) {
        Curso javaDoZero = new Curso("Collections", "Matheus");
        List<Aula> aulas = javaDoZero.getAulas();

        System.out.println(aulas); // nao tem nenhuma por que ainda nao foi adicionada nenhuma aula

        //FORMA CORRETA DE SE ADICIONAR, podendo assim excluir a linha 9 já q vc juntou direto na criação
        javaDoZero.getAulas().add(new Aula("Batatinha", 50));
        //FORMA "MAIS CORRETA" alem do ja falado acima, ela virou um metodo da sua class e ganhou mais de "program defensiva"
        javaDoZero.adicionaAula(new Aula ("Melhor forma de adicionar", 10));

        //Criando apartir da atribuição de List<Aula> aulas = javaDoZero.getAulas();
        aulas.add(new Aula("Metodos mais usados", 22));
        aulas.add(new Aula("Por que usar Collections", 11));
        aulas.add(new Aula("Praticando List / ArrayList / LinkedList", 33));

        System.out.println(aulas);

        //FORMA MAIS "ERRADA" em que alem de usar pela atribuição, vc atribui novamente e depois adiciona
        Aula a = new Aula("Lambdas", 30);
        Aula b = new Aula("Streams", 45);
        Aula c = new Aula("Quando usar List's", 15);

        aulas.add(a); aulas.add(b); aulas.add(c);

        System.out.println(aulas);
        System.out.println(javaDoZero.getAulas());
        // PORQUE AMBOS SOUT RETORNAM A MESMA LISTA? POR QUE AMBOS REFERENCIAM PARA O MESMO OBJ > linha 10
        System.out.println(aulas == javaDoZero.getAulas());
    }


}
