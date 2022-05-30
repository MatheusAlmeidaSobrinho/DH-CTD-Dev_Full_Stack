import java.net.SocketOption;

public class Impressora
{

    private String modelo;
    private String tipoConexao;
    private String dataFabricacao;

    private int folhasDisponiveis;

        public Impressora(String modelo, String tipoConexao, String dataFabricacao, int folhasDisponiveis)
        {
            this.modelo = modelo;
            this.tipoConexao = tipoConexao;
            this.dataFabricacao = dataFabricacao;
            this.folhasDisponiveis = folhasDisponiveis;
        }

        public boolean temFolha()
        {
            if(folhasDisponiveis > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    public void displaytemFolha()
    {
        if(temFolha())
        {
            System.out.printf("Tem: " + folhasDisponiveis + " folhas %n");
        }
        else
        {
            System.out.printf("acabou as folhas.%n");
        }
    }

        public void usarFolha()
        {
            folhasDisponiveis--;
        }

        public void qtdFolhaDisp()
        {
            System.out.printf("Impressora:"+ modelo +" com conexao do tipo: "+ tipoConexao+ ", atualmente com:"+ folhasDisponiveis + " folhas disponiveis.%n");
        }
}
