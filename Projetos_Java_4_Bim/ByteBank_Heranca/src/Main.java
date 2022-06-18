public class Main
{
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setSalario(5000.0);

        Funcionario v1 = new Vendedor();
        v1.setSalario(5000.0);

        MetodoGenerico x = new MetodoGenerico();

        x.registra(g1);
        x.registra(v1);
        System.out.println(x.getSoma());

    }
}