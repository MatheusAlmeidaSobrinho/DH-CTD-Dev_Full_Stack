public class Main
{
    public static void main(String[] args) {
        Player batatinha = new Player("Potato", "Fries");

        batatinha.aumentarPontuacao(1);
        batatinha.subirNivel(1);
        batatinha.aumentarPontuacao(1);
        batatinha.subirNivel(1);
        batatinha.bonusExtra();

        System.out.println("Jogador " + batatinha.mostrarJogador() + " ficou com a pontuacao: " + batatinha.mostrarPontuacao() + " e nivel: " + batatinha.mostrarnivel() + " pontuacao com bonus:" + batatinha.mostrarBonusExtra());
    }
}