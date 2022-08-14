package exercicioMesa;
import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> arvoreMap = new HashMap<>();

    public Arvore getArvore(int altura, int largura, String cor) {
        String arv = "altura: " + altura + ", largura: " + largura + ", cor: " + cor;

        System.out.println(arv);

        if (arvoreMap.containsKey(arv)) {
            Arvore arvore1 = arvoreMap.get(arv); // chamando o computador
            arvore1.setTipo(arvore1.getTipo() + 1); // incrementando
            System.out.println("Arvore existente" + "qtd:" + arvore1.);
            return arvore1;
        } else {
            arvoreMap.put(arv, new Arvore(altura, largura, cor));
            System.out.println("Arvore plantada");
            return arvoreMap.get(arv);
        }
    }

}
