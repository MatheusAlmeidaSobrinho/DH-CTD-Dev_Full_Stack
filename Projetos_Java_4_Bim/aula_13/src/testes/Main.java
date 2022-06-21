package testes;

import MinhasClasses.*;

public class Main {
    public static void main(String[] args)
    {
        ContaPoupanca cp = new ContaPoupanca();

        cp.depositar(200.0);
        System.out.println(cp.getSaldo());
        cp.sacar(150.0);
        System.out.println(cp.getSaldo());
        cp.sacar(150.0);
        System.out.println(cp.getSaldo());
        cp.depositar(50.0);
        cp.rendimentoJurosMensal(20);
        System.out.println(cp.getSaldo());

        ContaCorrente cc = new ContaCorrente();

        cc.depositar(200.0);
        cc.sacar(150.0);
        System.out.println(cc.getSaldo());
        cc.sacar(50.0);

        ContaCorrente cc2 = new ContaCorrente();
        ContaCorrente cc3 = new ContaCorrente();
        ContaCorrente cc4 = new ContaCorrente();
        cc2.depositar(900.0);
        cc3.depositar(1500.0);
        cc4.depositar(7500.0);

        cc2.imposto(0);
        System.out.println(cc2.getSaldo());

        cc3.imposto(10);
        System.out.println(cc3.getSaldo());

        cc4.imposto(10);
        System.out.println(cc4.getSaldo());

        System.out.println(cc4.informarSaldo());
    }
}