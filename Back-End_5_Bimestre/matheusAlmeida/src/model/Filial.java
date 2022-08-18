package model;

public class Filial {

    private int id;
    private String nome;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private boolean eCincoEstrelas;

    public Filial(int id, String nome, String rua, int numero, String cidade, String estado, boolean eCincoEstrelas) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public Filial(String nome, String rua, int numero, String cidade, String estado, boolean eCincoEstrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean iseCincoEstrelas() {
        return eCincoEstrelas;
    }

    public void seteCincoEstrelas(boolean eCincoEstrelas) {
        this.eCincoEstrelas = eCincoEstrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", eCincoEstrelas=" + eCincoEstrelas +
                '}';
    }
}

