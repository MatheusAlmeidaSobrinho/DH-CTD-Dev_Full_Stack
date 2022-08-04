public class Peso extends PadroesDeQualidade{
    @Override
    public void verificarQualidade(String nomeProduto,Integer lote, Integer peso, String embalagem) {
        if (peso > 1199 && peso < 1301){

        } else if(this.proximaVerificacao != null){
            this.proximaVerificacao.verificarQualidade(nomeProduto,lote,peso,embalagem);
        }
    }
}
