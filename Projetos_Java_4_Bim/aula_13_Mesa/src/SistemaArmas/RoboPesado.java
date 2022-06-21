package SistemaArmas;

import Interfaces.*;

public class RoboPesado extends SistemaArmas implements atacar {

    @Override
    public void mostrar(int hp) {
        System.out.println(hp);
    }

    @Override
    public int ataque(int dano) {
        return dano;
    }

}
