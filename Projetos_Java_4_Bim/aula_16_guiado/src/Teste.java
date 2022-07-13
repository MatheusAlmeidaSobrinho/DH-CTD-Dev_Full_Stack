public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Potato","Fries","434528571", 2000.0);

        System.out.println(cliente.toString());

        cliente.comprar(1000.0);
        System.out.println(cliente.getTotalGastosCartao());
        cliente.comprar(500);
        System.out.println(cliente.getTotalGastosCartao());
        cliente.pagarDivida(1400.0);
        cliente.pagarDivida(100.0);
        cliente.pagarDivida(100.0);

    }
}
