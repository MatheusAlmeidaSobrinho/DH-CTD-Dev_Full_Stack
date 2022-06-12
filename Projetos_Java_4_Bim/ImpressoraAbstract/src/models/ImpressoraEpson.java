package models;

public class ImpressoraEpson extends Impressora
{
    public ImpressoraEpson(String modelo,String tipoConexao, int folhasDisponiveis,double porcentagemTinta)
    {
        super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir()
    {
        if(!super.precisaTinta() && super.temPapel())
        {
            super.tiraPapel();
            super.tiraTinta(0.1);
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

}
