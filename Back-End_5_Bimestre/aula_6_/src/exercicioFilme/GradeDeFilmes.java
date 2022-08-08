package exercicioFilme;

public class GradeDeFilmes implements IGradeDeFilmes {
    public GradeDeFilmes() {
    }

    public Filme getFilme(String nomeFilme) {
        Filme f = null;
        switch (nomeFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "Argentina", "www.wtiger.com");
                break;
            case "His House":
                f = new Filme("His House", "Brasil", "www.hhouse.com");
                break;
            case "Over the Moon":
                f = new Filme("Over the Moon", "Colombia", "www.omoon.com");
                break;
            case "Superbad":
                f = new Filme("Superbad", "Argentina", "www.sbad.com");
                break;
            case "The Babysitter":
                f = new Filme("The Babysitter", "Colombia", "www.babys.com");
        }

        return f;
    }
}


