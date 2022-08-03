public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Potato",1);
        func1.vender(2);
        Funcionario func2 = new Funcionario("Fries",2);
        func2.vender(3);
        Funcionario func3 = new Funcionario("ItsMy",5);
        func3.vender(4);
        Funcionario func4 = new Funcionario("CeLoko",0);
        func4.vender(5);

        Vendedor afi1 = new Afiliado("Batata");
        afi1.vender(1);
        Vendedor afi2 = new Afiliado("Alfa");
        afi2.vender(2);
        Vendedor afi3 = new Afiliado("Beta");
        afi3.vender(3);
        Vendedor afi4 = new Afiliado("Gama");
        afi4.vender(4);

        Estagiario indigente1 = new Estagiario("FazNada");
        Estagiario indigente2 = new Estagiario("RapazDoCafe");

        func1.addAfiliado(afi1);
        func2.addAfiliado(afi2);
        func2.addAfiliado(afi3);
        func3.addAfiliado(afi4);

        indigente1.vender(5);
        indigente2.vender(11);

        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(func3.mostrarCategoria());
        System.out.println(func4.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
        System.out.println(afi4.mostrarCategoria());
        System.out.println(indigente1.mostrarCategoria());
        System.out.println(indigente2.mostrarCategoria());

    }
}
