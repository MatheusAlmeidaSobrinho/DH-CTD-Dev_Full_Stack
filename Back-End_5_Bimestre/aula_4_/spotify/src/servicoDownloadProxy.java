public class servicoDownloadProxy implements Plano{
    @Override
    public void planoAtual(String nome, int id, String plano) {
        if (plano.equalsIgnoreCase("free")){
            System.out.println("Atualmente voc� esta na assinatura: " + plano + " e n�o possui permiss�o para download offline");
        } else if (plano.equalsIgnoreCase("premium")){
            System.out.println("Atualmente voc� esta na assinatura: " + plano + " e possui permiss�o para download offline Enjoy =D");
        } else {
            System.out.println("Algo de errado n�o est� certo!");
        }
    }
}
