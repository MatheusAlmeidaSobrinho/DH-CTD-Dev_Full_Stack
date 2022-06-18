public class Vendedor extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Vendedor");
        return 300.0;
    }
}
