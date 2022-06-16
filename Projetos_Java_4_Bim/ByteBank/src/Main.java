public class Main {
    public static void main(String[] args) {

        Conta cc1 = new Conta();
        Conta cc2 = new Conta();

        cc1.depositar(100);
        cc2.depositar(500);

        System.out.println(cc1.saldo);
        System.out.println(cc2.saldo);

        cc2.transferir(200,cc1);

        System.out.println(cc1.saldo);
        System.out.println(cc2.saldo);

        cc1.sacar(150);
    }
}