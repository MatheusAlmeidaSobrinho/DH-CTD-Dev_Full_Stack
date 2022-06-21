package SistemaArmas;

public abstract class SistemaArmas
{
    private int hp;

    public abstract void mostrar(int hp);

    public int getHp() {
        return hp;
    }

    public void atribuirHp(int valor)
    {
        this.hp += valor;
    }

    public void retirarHp(int dano)
    {
        this.hp -= dano;
    }

    public void darDano(int dano, SistemaArmas oponente)
    {
        oponente.retirarHp(dano);
        System.out.println("Oponente causou dano total de: " + dano);
    }


}
