public class Jogador{
    private String sobrenome;
    private String posicao;
    private int numeroCamisa;

    public Jogador(String sobrenome, String posicao, int numeroCamisa) {
        if(posicao != "Goleiro" && posicao != "Defensor" && posicao != "Meio-campo" && posicao != "Atacante"){
            throw new PlayerException("Posição inválida");
        }
        this.numeroCamisa = numeroCamisa;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
    }

    public String getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return " [Sobrenome: " + this.sobrenome + ", posição: " + this.posicao + ", numero da camisa: " + this.numeroCamisa + ".]";
    }
}
