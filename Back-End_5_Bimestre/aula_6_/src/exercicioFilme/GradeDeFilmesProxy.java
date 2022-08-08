package exercicioFilme;

public class GradeDeFilmesProxy implements IGradeDeFilmes {
    private GradeDeFilmes gradeDeFilmes;
    private Ip ip;

    public GradeDeFilmesProxy(GradeDeFilmes gradeDeFilmes) {
        this.gradeDeFilmes = gradeDeFilmes;
    }

    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = this.gradeDeFilmes.getFilme(nomeFilme);
        if (!this.getIp().getPais().equalsIgnoreCase(filme.getPais())) {
            throw new FilmeNaoHabilitadoException(nomeFilme + " não disponível no(a) " + this.getIp().getPais());
        } else {
            return filme;
        }
    }

    public void setGradeDeFilmes(GradeDeFilmes gradeDeFilmes) {
        this.gradeDeFilmes = gradeDeFilmes;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public Ip getIp() {
        return this.ip;
    }
}
