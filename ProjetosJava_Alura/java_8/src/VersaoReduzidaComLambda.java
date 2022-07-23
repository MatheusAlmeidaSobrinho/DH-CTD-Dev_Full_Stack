import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class VersaoReduzidaComLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Bloodborne Remastered");
        words.add("Dark souls");
        words.add("Lasted of us");
        words.add("Hitman");

        words.forEach(System.out::println);

        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);

        for (String nomeJogos : words) {System.out.println(nomeJogos);}

        //alguns ajustes foram feitos pelo intellij, mais antes dele refatorar ja tinha ficado muito pequeno
    }
}
