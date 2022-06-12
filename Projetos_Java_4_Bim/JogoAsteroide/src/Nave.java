public class Nave extends Objeto
{
    private double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, double velocidade, int vida)
    {
    super(posx,posy,direcao);
    this.velocidade = velocidade;
    this.vida = 100;
    }

    public irA(int posx, int posy, char direcao)
    {
        super(posx,posy,direcao);
    }

    public girar(int posx, int posy, char direcao)
    {
        super(posx,posy,direcao);
    }

    public restaVida()
    {
        this.vida -= danos;
    }

}

