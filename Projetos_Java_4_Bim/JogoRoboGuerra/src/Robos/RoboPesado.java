package Robos;

public class RoboPesado extends  SistemaArmas implements Commands
{
    public RoboPesado(int hp, int energia, int poderEspecial) {
        super(hp, energia, poderEspecial);
    }

    @Override
    public int atacar(int ataque)
    {
        return ataque = 1;
    }

    @Override
    public int defender(int defesa)
    {
        return defesa = 10;
    }

    @Override
    public void voar() {
        System.out.println("Pode voar: Sim!");
    }

    @Override
    public void mostrarDados() {
        System.out.println();
        System.out.println("ROBO PESADO");
        System.out.println("Pontos de Hp: " + this.getHp());
        System.out.println("Pontos de Energia Disponiveis para atacar: " + this.getEnergia());
        System.out.println("Dano do Poder especial: " + this.getPoderEspecial());
    }
}
