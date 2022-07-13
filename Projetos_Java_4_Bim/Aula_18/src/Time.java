import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public Time(String nome) {
        this.nome = nome;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void addJogador(ArrayList<Jogador> jogadoresPraAdicionar){
        jogadores.addAll(jogadoresPraAdicionar);
    }
    public ArrayList<Jogador> obterReservas(){
        ArrayList<Jogador> reservas = new ArrayList<Jogador>();
        for(int i = 1; i <= 5; i ++){
            reservas.add(this.jogadores.get(this.jogadores.size() - i));
        }
        return reservas;
    }



    public int quantidadeDeJogadores(String posicao) {

        if (posicao != "Goleiro" && posicao != "Defensor" && posicao != "Meio-campo" && posicao != "Atacante") {
            throw  new PlayerException("Posição informada invalida!");
        }
            ArrayList<Jogador> posicaoJogadores = new ArrayList<Jogador>();

            //for(int i = 0; i < this.jogadores.size(); i++ )
            for (Jogador jogador : this.jogadores) {
                if (jogador.getPosicao() == posicao) {
                    posicaoJogadores.add(jogador);
                }
            }
            return posicaoJogadores.size();
        }

}

