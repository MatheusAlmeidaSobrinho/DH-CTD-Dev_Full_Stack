public class ChegarQualidade extends PadroesDeQualidade{
    @Override
    public void verificarQualidade(String nomeProduto,Integer lote, Integer peso, String embalagem) {
        if (nomeProduto != null && lote > 999 && lote < 2001 && peso > 1199 && peso < 1301 && (embalagem.equals("saudável")  || embalagem.equals("quase saudável")
                || embalagem.equals("saudavel")  || embalagem.equals("quase saudavel"))){
            System.out.println("Produto "+ nomeProduto + " aceito!");
        } else {
            System.out.println("Produto "+ nomeProduto + " recusado!");
        }

    }
}
