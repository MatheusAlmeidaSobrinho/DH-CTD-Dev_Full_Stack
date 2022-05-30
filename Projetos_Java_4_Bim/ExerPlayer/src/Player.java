public class Player
{
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;
    private int bonus;

        public Player(String nome, String nickname)
        {
            this.nome = nome;
            this.nickname = nickname;
            this.pontuacao = 0;
            this.nivel = 0;
        }

    public String mostrarJogador()
    {
        return nome + nickname;
    }
        public void aumentarPontuacao(int pontuacao)
        {
            this.pontuacao += 1;
        }
        public int mostrarPontuacao()
        {
            return pontuacao;
        }


        public void subirNivel(int nivel)
        {
            this.nivel += 1;
        }
        public int mostrarnivel()
        {
            return nivel;
        }

        public void bonusExtra()
        {
            this.bonus = (this.pontuacao + this.nivel) * 2;
        }
        public int mostrarBonusExtra()
        {
            return bonus;
        }

}
