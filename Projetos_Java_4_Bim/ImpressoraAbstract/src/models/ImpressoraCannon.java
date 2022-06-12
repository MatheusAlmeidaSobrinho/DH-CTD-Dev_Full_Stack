package models;

public class ImpressoraCannon extends Impressora
{
    public ImpressoraCannon(String modelo,String tipoConexao, int folhasDisponiveis,double porcentagemTinta)
    {
        super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);

    }

    @Override
    public String imprimir()
    {
        if(!this.precisaTinta() && super.temPapel())
        {
            super.tiraPapel();
            super.tiraTinta(0.2);
            return "imprimindo!";
        }
        else if (super.precisaTinta() && !super.temPapel())
        {
            return "Falta tinta e papel!";
        }
        else if (super.precisaTinta())
        {
            return "Falta tinta!";
        }
        else
        {
            return "Falta papel!";
        }
    }

    @Override
    public boolean precisaTinta()
    {
        if(super.getPorcentagemTinta() >= 0.2)
        {
            return false;
        }
        return true;
    }
}
