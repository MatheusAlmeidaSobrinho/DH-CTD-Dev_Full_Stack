package Enterprise;

public class Vendedor extends Funcionario {
    private double comissao;
    private double bonusMeta;

    public Vendedor(String nome, String sobrenome, String cpf, String email, int matricula, double salario, double comissao, double bonusMeta) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.comissao = comissao;
        this.bonusMeta = bonusMeta;
    }

    public double pagamento() {
        return this.comissao >= 1000.0 ? super.getSalario() + this.comissao + this.bonusMeta : super.getSalario() + this.comissao;
    }
}
