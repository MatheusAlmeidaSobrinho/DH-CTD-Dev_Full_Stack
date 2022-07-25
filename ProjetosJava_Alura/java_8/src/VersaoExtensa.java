import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class VersaoExtensa {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Bloodborne Remastered");
        words.add("Dark souls");
        words.add("Lasted of us");
        words.add("Hitman");


        Consumer<String> consumidor = new ImprimeNaLinha();
        words.forEach(consumidor);

        Comparator<String> comparador = new ComparadorPorTamanho();
        words.sort(comparador);

        System.out.println(words);

        for (String nomeJogos : words) {

            System.out.println(nomeJogos);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
        // daria para fazer esse if assim: return Integer.compare(s1.length(), s2.length());
    }
}