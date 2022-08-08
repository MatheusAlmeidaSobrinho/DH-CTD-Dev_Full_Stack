package exercicioFilme;

public class Filme {
    private String nome;
    private String pais;
    private String link;

    public Filme(String nome, String pais, String link) {
        this.nome = nome;
        this.pais = pais;
        this.link = link;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
