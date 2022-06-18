public class ContaCorrente extends Conta
{
    public ContaCorrente(int numConta, int agencia) {
        super(numConta, agencia);
    }

    @Override
    public boolean sacar(double valor) {
        double valorDeSaqueMaisTaxa = valor + 0.25;
        return super.sacar(valorDeSaqueMaisTaxa);
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        double valorDeSaqueMaisTaxa = valor + 0.5;
        return super.transferir(valorDeSaqueMaisTaxa, destino);
    }
}
