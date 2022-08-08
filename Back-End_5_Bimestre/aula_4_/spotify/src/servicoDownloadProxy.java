public class servicoDownloadProxy implements Plano{
    @Override
    public void planoAtual(String nome, int id, String plano) {
        if (plano.equalsIgnoreCase("free")){
            System.out.println("Atualmente você esta na assinatura: " + plano + " e não possui permissão para download offline");
        } else if (plano.equalsIgnoreCase("premium")){
            System.out.println("Atualmente você esta na assinatura: " + plano + " e possui permissão para download offline Enjoy =D");
        } else {
            System.out.println("Algo de errado não está certo!");
        }
    }
}
