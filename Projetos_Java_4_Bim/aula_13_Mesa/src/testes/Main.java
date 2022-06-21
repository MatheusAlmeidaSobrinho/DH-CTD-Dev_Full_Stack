package testes;

import SistemaArmas.*;

public class Main {
    public static void main(String[] args)
    {
        RoboPesado r1 = new RoboPesado();
        RoboPesado r2 = new RoboPesado();

        r1.atribuirHp(10);

        r2.atribuirHp(10);

        r1.darDano(2,r2);

        System.out.println(r2.getHp());

    }
}