package Robos;

public abstract class SistemaArmas
{
    private int hp;
    private int energia;
    private int poderEspecial;

    public SistemaArmas(int hp, int energia, int poderEspecial) {
        this.hp = hp;
        this.energia = energia;
        this.poderEspecial = poderEspecial;
    }

    public int getHp() {
        return hp;
    }

    public int getEnergia() {
        return energia;
    }

    public int getPoderEspecial() {
        return poderEspecial;
    }

    public void mostrarDados()
    {
        System.out.println();
    }
}
