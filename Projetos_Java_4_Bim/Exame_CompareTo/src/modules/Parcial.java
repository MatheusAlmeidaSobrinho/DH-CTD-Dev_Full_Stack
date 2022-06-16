package modules;

public class Parcial extends  Exame
{
    private int unidade;
    private int numeroTentativas;

    public boolean tentarProvaParcialDenovo()
    {
        if(this.unidade <= 3)
        {
            if (this.numeroTentativas < 3)
            {
                return true;
            }
            return false;
        }
        if(this.numeroTentativas < 2)
        {
            return true;
        }
        return false;
    }
}
