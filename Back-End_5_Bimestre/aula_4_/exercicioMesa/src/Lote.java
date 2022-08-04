public class Lote extends PadroesDeQualidade{
    @Override
    public void verificarQualidade(String nomeProduto,Integer lote, Integer peso, String embalagem) {
        if (lote > 999 && lote < 2001){
        } else if(this.proximaVerificacao != null){
            this.proximaVerificacao.verificarQualidade(nomeProduto,lote,peso,embalagem);
        }
    }
}
