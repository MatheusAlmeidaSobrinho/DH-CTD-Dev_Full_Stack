public abstract class PadroesDeQualidade {
    private String nomeProduto;
    protected PadroesDeQualidade proximaVerificacao;

    public abstract void verificarQualidade(String nomeProduto,Integer lote, Integer peso, String embalagem);

    public PadroesDeQualidade setProximaVerificacao(PadroesDeQualidade proximaVerificacao) {
        this.proximaVerificacao = proximaVerificacao;
        return this;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}
