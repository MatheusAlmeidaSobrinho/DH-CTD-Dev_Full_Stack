public class Main
{
    public static void main(String[] args)
    {

        ContaCorrente cc = new ContaCorrente(100,321);
        ContaPoupanca cp = new ContaPoupanca(200,321);

        cc.depositar(250.0);
        cp.depositar(500.0);

        cc.transferir(100.0,cp);
        cp.transferir(100.0,cc);

        System.out.println("CC:" + cc.getSaldo());
        System.out.println("CP:" + cp.getSaldo());

        cc.sacar(50.0);
        System.out.println("CC:" + cc.getSaldo());
    }
}