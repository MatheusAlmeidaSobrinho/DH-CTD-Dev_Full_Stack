package exercicioFilme;

public interface IGradeDeFilmes {
    Filme getFilme(String var1) throws FilmeNaoHabilitadoException;
}
