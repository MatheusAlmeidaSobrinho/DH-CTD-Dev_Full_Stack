package exercicioAula;

public class Quadrado {
    private String cor;
    private int tamanho;

    public Quadrado(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }
}