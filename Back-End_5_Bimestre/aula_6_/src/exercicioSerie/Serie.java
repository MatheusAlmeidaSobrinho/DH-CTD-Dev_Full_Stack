package exercicioSerie;

public class Serie {
    private String nomeSerie;
    private String link;

    public Serie(String nomeSerie, String link) {
        this.nomeSerie = nomeSerie;
        this.link = link;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public String getLink() {
        return link;
    }
}
