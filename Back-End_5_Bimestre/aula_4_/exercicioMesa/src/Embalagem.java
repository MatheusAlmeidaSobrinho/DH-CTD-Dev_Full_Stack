public class Embalagem extends PadroesDeQualidade{
    @Override
    public void verificarQualidade(String nomeProduto,Integer lote, Integer peso, String embalagem) {
        if (embalagem.equals("saud�vel")  || embalagem.equals("quase saud�vel")
            || embalagem.equals("saudavel")  || embalagem.equals("quase saudavel")){
        } else if(this.proximaVerificacao != null){
            this.proximaVerificacao.verificarQualidade(nomeProduto,lote,peso,embalagem);
        }
    }
}

