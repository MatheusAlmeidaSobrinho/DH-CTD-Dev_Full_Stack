package Classes;

public abstract class Conta
{
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public double informarSaldo()
    {
        return this.saldo;
    }

    public abstract void sacar(double valor);
}
