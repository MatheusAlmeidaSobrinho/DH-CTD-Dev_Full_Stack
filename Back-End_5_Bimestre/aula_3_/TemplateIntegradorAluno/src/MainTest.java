import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    Funcionario func1, func2, func3, func4;
    Afiliado afi1, afi2, afi3, afi4;
    Estagiario indigente1, indigente2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Potato",1);
        func1.vender(2);
        func2 = new Funcionario("Fries",2);
        func2.vender(3);
        func3 = new Funcionario("ItsMy",5);
        func3.vender(4);
        func4 = new Funcionario("CeLoko",0);
        func4.vender(5);

        afi1 = new Afiliado("Batata");
        afi1.vender(1);
        afi2 = new Afiliado("Alfa");
        afi2.vender(2);
        afi3 = new Afiliado("Beta");
        afi3.vender(3);
        afi4 = new Afiliado("Gama");
        afi4.vender(4);

        indigente1 = new Estagiario("FazNada");
        indigente2 = new Estagiario("RapazDoCafe");

        func1.addAfiliado(afi1);
        func2.addAfiliado(afi2);
        func2.addAfiliado(afi3);
        func3.addAfiliado(afi4);

        indigente1.vender(5);
        indigente2.vender(11);

    }

    @Test
    public void mostrarVendedores() {
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