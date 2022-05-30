import java.util.Locale;
import java.util.Scanner;

public class Artigo
{
    private String descricao;
    private double preco_venda;
    private int estoque;

        public Artigo(String descricao, double preco, int quantidade)
        {
            this.descricao = descricao;
            this.preco_venda = preco;
            this.estoque = quantidade;
        }

        public boolean temEstoque()
        {
            if (estoque > 0)
            {
                System.out.println("Estoque positivo");
                return true;
            }
            else
            {
                System.out.println("Estoque zerado ou negativo");
                return false;
            }
        }

        public double consultarPreco()
        {
            return preco_venda;
        }
}
