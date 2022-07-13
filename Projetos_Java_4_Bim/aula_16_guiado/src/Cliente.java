public class Cliente {

    private String nome;
    private String sobrenome;
    private String rg;
    private double totalGastosCartao;
    private double limiteCartao;
    private double dividaCartao;

    public Cliente(String nome, String sobrenome, String rg, double limiteCartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limiteCartao = limiteCartao;
        this.totalGastosCartao = 0;
        this.dividaCartao = this.totalGastosCartao;
    }

    public double getTotalGastosCartao() {
        return totalGastosCartao;
    }

    public void comprar(double valor) {
        if(this.totalGastosCartao + valor <= this.limiteCartao) {
        this.totalGastosCartao += valor;
        } if (this.totalGastosCartao + valor > this.limiteCartao) {
            throw new ClientException("Valor solicitado para compra acima do limite atual do cartão");
        }
    }

    public void pagarDivida(double valor){
        if(this.totalGastosCartao <= 0)
            throw new ClientException("Não consta divida!");
        if(this.totalGastosCartao - valor < 0)
            throw new ClientException("Valor de pagamento maior que a divida!" + ", valor divida: " + this.totalGastosCartao);
        if(this.totalGastosCartao - valor >= 0) {
            this.totalGastosCartao -= valor;
            System.out.println("Pagou " + valor + ", valor restante de debito: " + this.totalGastosCartao);
        }
    }

    @Override
    public String toString() {
        return "Cliente: " +
                this.nome + ' ' + this.sobrenome + ' '
                + ", seu debito é= R$ " + this.totalGastosCartao
                + " limite do cartão: " + limiteCartao;
    }
}
