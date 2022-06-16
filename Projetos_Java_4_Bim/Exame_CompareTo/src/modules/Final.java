package modules;

public class Final extends Exame implements Comparable<Final>
{
    private double notaOral;
    private String descricao;

    public double notaMedia()
    {
        return (super.getNota() + this.notaOral) / 2;
    }

    @Override
    public boolean aprovado() {
        if(this.notaMedia() >= 4)
        {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Final batata) {
        if(this.notaMedia() == batata.notaMedia())
        {
            return 0;
        }
        if(this.notaMedia() > batata.notaMedia())
        {
            return 1;
        }
        return -1;
    }
}
