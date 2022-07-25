import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class VersaoReduzidaComLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Bloodborne Remastered");
        words.add("Dark souls");
        words.add("Lasted of us");
        words.add("Hitman");

        words.forEach(System.out::println);

        words.sort(Comparator.comparingInt(s -> s.length()));
        System.out.println(words);
        // Logo de cara vc ve q esta amarelo, ele quer mudar para a forma debaixo, mais tem o risco de ficar ambiguo
        // evite a forma debaixo só por precaução, e abaixo dela tem a forma reduzida mais que ainda não é uma
        // lambda, não se usa ela mais é bom saber o passo a passo, que é uma função q vira um comparator que vira o metodo sort

//        words.sort(Comparator.comparingInt(String::length));

//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        words.sort(comparador);

        for (String nomeJogos : words) {System.out.println(nomeJogos);}

        new Thread(() -> {System.out.println("Executando um Runnable");}).start();

        words.sort(String.CASE_INSENSITIVE_ORDER);

        //alguns ajustes foram feitos pelo intellij, mais antes dele refatorar ja tinha ficado muito pequeno
    }
}
