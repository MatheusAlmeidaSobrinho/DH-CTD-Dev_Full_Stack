package MinhasClasses;

public abstract class Conta
{
    private double saldo;

    public double depositar(double valor){
       return this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public double informarSaldo(){
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
