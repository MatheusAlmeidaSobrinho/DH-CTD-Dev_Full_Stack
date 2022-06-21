package MinhasClasses;

public class ContaPoupanca extends Conta
{

    @Override
    public void sacar(double valor)
    {
        if(super.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Você não possui saldo. " + " Valor solicitado: " + valor + ", valor disponivel: " + getSaldo());
        }
    }

    public void rendimentoJurosMensal(int dias){
        this.setSaldo(this.getSaldo() * 1.01 +  (0.1 * dias));
    }


}
