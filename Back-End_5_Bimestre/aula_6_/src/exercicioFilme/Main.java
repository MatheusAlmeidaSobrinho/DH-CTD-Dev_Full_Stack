package exercicioFilme;

public class Main {
    public static void main(String[] args) {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(100, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso Liberado");
        } catch (FilmeNaoHabilitadoException var3) {
            System.out.println(var3);
        }

    }

}