public class AssociadoHabilitado extends Associado
{
    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numAssociado,String nome,double valorMensal, String atividade, double custoPiscina, boolean habilitado)
    {
        super(numAssociado,nome,valorMensal,atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = false;
    }

    public void fazExame(boolean aprovado)
    {
        this.habilitado = aprovado;
    }

    @Override
    public double custoMensal()
    {
        if(this.habilitado)
        {
            return super.custoMensal() + this.custoPiscina;
        }
        else
        {
            return super.custoMensal();
        }
    }
}
