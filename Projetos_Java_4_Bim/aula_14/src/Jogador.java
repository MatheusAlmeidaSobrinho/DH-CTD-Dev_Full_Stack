public class Jogador implements Comparable<Jogador>{

    private int numeroCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numeroCamisa, String nome, boolean lesionado, boolean titular) {
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jogador jogador){
        if (this.numeroCamisa == jogador.numeroCamisa){
            return 0;
        } else if (this.numeroCamisa < jogador.numeroCamisa){
            return 1;
        } else {
            return -1;
        }
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
