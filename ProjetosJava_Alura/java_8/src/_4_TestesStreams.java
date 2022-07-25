import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4_TestesStreams {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
//        System.out.println(cursos);
//        System.out.println();
//
//        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//        System.out.println(cursos);
//        System.out.println();
//
//        cursos.forEach(c -> System.out.println(c));
//        for (Curso qntAlunos: cursos) {
//            if (qntAlunos.getAlunos() > 100) {
//                System.out.println(qntAlunos);
//            }
//        };

        // usando STREAMS agora, sempre lembre que nada do que vc faz aqui afeta a lista original o codigo original
        // vale lembrar que tem q se voce nao puxar um sout ou algo do genero, ele nao vai aparecer
        // aqui começa o tal do . alguma . alguma . alguma e assim por diante...
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(batata -> batata.getNome() == "Java 8").forEach(batata -> System.out.println(batata.getNome()));

        boolean celoko = cursos.stream().allMatch(curso -> curso.getNome() == "Java");
        System.out.println(celoko);

        cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(c -> System.out.println(c));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .forEach(System.out::println);

        cursos.stream()
                .map(Curso::getNome)
                .forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

       cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList())
                .forEach(c -> System.out.println(c));

       cursos.stream()
               .filter(c -> c.getAlunos() >= 100)
               .collect(Collectors.toMap(
                       c -> c.getNome(),
                       c -> c.getAlunos()))
               .forEach((nome, alunos) ->System.out.println(nome + " tem " + alunos + "alunos"));
    }
}
