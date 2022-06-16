public class Conta
{
    String titular;
    double saldo;
    int numConta;
    int agencia;

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public boolean sacar(double valor)
    {
        if(this.saldo >= valor)
        {
            this.saldo -= valor;
            System.out.println("Valor " + valor + " sacado com sucesso, saldo disponivel: " + this.saldo);
            return true;
        } else
        {
            System.out.println("Saldo atual:" + this.saldo + ". Valor solicitado: " + valor);
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino)
    {
        if(this.saldo >= valor)
        {
            this.saldo -= valor; // this.sacar(valor);
            destino.depositar(valor);
            return true;
        }
        else
        {
            return false;
        }
    }





}
