public class Main {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(11, "Carol", true, true);
        Jogador jogador2 = new Jogador(24, "Diego", true, true);
        Jogador jogador3 = new Jogador(9, "Ronaldo", false, true);
        Jogador jogador4 = new Jogador(7, "CR7", false, true);
        Jogador jogador5 = new Jogador(8, "Kaká", false, false);

        Equipe equipe = new Equipe("batata FC");

        equipe.addJogador(jogador1);
        equipe.addJogador(jogador2);
        equipe.addJogador(jogador3);
        equipe.addJogador(jogador4);
        equipe.addJogador(jogador5);

        equipe.mostrarJogadoresTitulares();

        System.out.println("Titulares lesionados: " + equipe.getQuantidadeJogadoresLesionados());

    }
}