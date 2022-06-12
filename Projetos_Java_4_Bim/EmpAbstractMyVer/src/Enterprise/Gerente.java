package Enterprise;

import java.io.PrintStream;

public class Gerente extends Funcionario
{
    private double bonus;

    public Gerente(String nome, String sobrenome, String cpf, String email, int matricula, double salario, double bonus)
    {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.bonus = bonus;
    }

    @Override
    public double pagamentoPadrao() {
        return super.pagamentoPadrao() * 2;
    }
    public double pagamentoTotal(){
        return pagamentoPadrao() + this.bonus;
    }

    public void dadosDoGerente()
    {
        System.out.println("Dados do Gerente:");
        System.out.println("Nome completo: " + super.getNome() + " " + super.getSobrenome());
        System.out.println("CPF:" + super.getCpf() + "/ Email: " + super.getEmail() + "/ Matricula: " + super.getMatricula());
        System.out.println("Salario fixo: R$" + this.pagamentoPadrao() + " Bonus: R$" + this.bonus + " Pagamento final: R$" + pagamentoTotal());
    }
}
