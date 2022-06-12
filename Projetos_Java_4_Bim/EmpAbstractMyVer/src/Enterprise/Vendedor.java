package Enterprise;

public class Vendedor extends Funcionario {
    private double comissao;
    private double bonusMeta;

    public Vendedor(String nome, String sobrenome, String cpf, String email, int matricula, double salario, double comissao, double bonusMeta) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.comissao = comissao;
        this.bonusMeta = bonusMeta;
    }

    @Override
    public double pagamentoPadrao() {
        return super.pagamentoPadrao() * 1.5;
    }

    public double bonusMeta()
    {
        if( this.bonusMeta <= 3)
        {
            return 250.00;
        }
        else if(this.bonusMeta <= 6)
        {
            return 500.00;
        }
        else if (this.bonusMeta <= 9)
        {
            return 750.00;
        }
        else if (this.bonusMeta > 9 && this.bonusMeta < 11)
        {
            return 1000.00;
        }
        else
            return this.bonusMeta = 0;
    }

    public double pagamentoTotal()
    {
        return pagamentoPadrao() + comissao + bonusMeta();
    }

    public void dadosDoVendedor()
    {
        System.out.println();
        System.out.println("Dados do Vendedor:");
        System.out.println("Nome completo: " + super.getNome() + " " + super.getSobrenome());
        System.out.println("CPF:" + super.getCpf() + "/ Email: " + super.getEmail() + "/ Matricula: " + super.getMatricula());
        System.out.println("Salario fixo: R$" + this.pagamentoPadrao() + " Comissao: R$" + this.comissao
                + "  bonusMeta: R$" + this.bonusMeta() + " Pagamento total: R$" + pagamentoTotal());
    }
}
