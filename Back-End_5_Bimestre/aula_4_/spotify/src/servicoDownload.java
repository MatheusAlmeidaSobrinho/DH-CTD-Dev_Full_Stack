public class servicoDownload implements Plano {


    @Override
    public void planoAtual(String nome, int id, String plano) {
        System.out.println("Usuário(a): " + nome + " Id: " + id + " assinante do plano: " + plano);
    }
}
