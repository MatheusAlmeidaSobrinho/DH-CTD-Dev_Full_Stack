public class servicoDownload implements Plano {


    @Override
    public void planoAtual(String nome, int id, String plano) {
        System.out.println("Usu�rio(a): " + nome + " Id: " + id + " assinante do plano: " + plano);
    }
}
