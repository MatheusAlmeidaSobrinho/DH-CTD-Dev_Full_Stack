package exercicioAula;

public class Triangulo {
    private String cor;
    private int tamanho;

    public Triangulo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "exercicioAula.Triangulo{" +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}

