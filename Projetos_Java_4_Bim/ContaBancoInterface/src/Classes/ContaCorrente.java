package Classes;

public class ContaCorrente extends  Conta implements GravarImposto
{
    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido)
    {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public double imposto(double porcentagem) {
        return porcentagem;
    }

    @Override
    public void sacar(double valor)
    {
        if (this.getSaldo() >= valor + valor * this.imposto(0.01))
        {
            this.setSaldo(getSaldo() - (valor + valor * this.imposto(0.01)));
            System.out.println("Valor sacado!");
        }
        else
        {
            System.out.println("Esta sem saldo");
        }
    }
}
