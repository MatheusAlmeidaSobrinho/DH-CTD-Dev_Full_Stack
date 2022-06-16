package Robos;

public class Tanque extends  SistemaArmas implements Commands
{
    public Tanque(int hp, int energia, int poderEspecial) {
        super(hp, energia, poderEspecial);
    }

    @Override
    public int atacar(int ataque)
    {
        return ataque = 3;
    }

    @Override
    public int defender(int defesa)
    {
        return defesa = 12;
    }

    @Override
    public void voar() {
        System.out.println("Pode voar: Não!");
    }

    @Override
    public void mostrarDados() {
        System.out.println();
        System.out.println("TANQUE");
        System.out.println("Pontos de Hp: " + this.getHp());
        System.out.println("Pontos de Energia Disponiveis para atacar: " + this.getEnergia());
        System.out.println("Dano do Poder especial: " + this.getPoderEspecial());
    }
}
