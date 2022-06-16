package modules;

public abstract class Exame
{
    private String titulo;
    private double nota;


    public boolean aprovado()
    {
        if(this.nota >= 4)
        {
            return true;
        }
        return false;
    }

    public double getNota() {
        return nota;
    }
}
