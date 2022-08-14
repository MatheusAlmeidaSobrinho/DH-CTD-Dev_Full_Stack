package ExercicioIntegrador.models;

public class Roupa {
    private String tamanho;
    private String tipo;
    private boolean eNova;
    private boolean eImportada;

    private int contador;

    public Roupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNova = eNova;
        this.eImportada = eImportada;
        this.contador = 1;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean iseNova() {
        return eNova;
    }

    public void seteNova(boolean eNova) {
        this.eNova = eNova;
    }

    public boolean iseImportada() {
        return eImportada;
    }

    public void seteImportada(boolean eImportada) {
        this.eImportada = eImportada;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return " [Roupa]";
    }
}
