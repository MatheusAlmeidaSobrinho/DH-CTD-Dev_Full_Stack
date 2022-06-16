package Robos;

import org.w3c.dom.ls.LSOutput;

public class RoboLeve extends SistemaArmas implements Commands
{
    public RoboLeve(int hp, int energia, int poderEspecial) {
        super(hp, energia, poderEspecial);
    }

    @Override
    public int atacar(int ataque)
    {
        return ataque;
    }

    @Override
    public int defender(int defesa)
    {
        return defesa;
    }

    @Override
    public void voar() {
        System.out.println("Pode voar: Sim!");
    }

    @Override
    public void mostrarDados() {
        System.out.println();
        System.out.println("ROBO LEVE");
        System.out.println("Pontos de Hp: " + this.getHp());
        System.out.println("Pontos de Energia Disponiveis para atacar: " + this.getEnergia());
        System.out.println("Dano do Poder especial: " + this.getPoderEspecial());
        System.out.println("Poder de ataque: " + atacar(2));
        System.out.println("Poder de defesa: " + defender(5));
        voar();
    }



    public int sofreDano()
    {
        if(this.getHp() > 0)
        {
            return this.getHp() - 2;
        }
        else {
            return this.getHp() - 2;
        }
    }
}
