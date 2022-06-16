import Robos.RoboLeve;
import Robos.RoboPesado;
import Robos.Tanque;

public class Main {
    public static void main(String[] args)
    {
        RoboLeve one = new RoboLeve(15,15,4);
        RoboPesado two = new RoboPesado(20, 10, 2);
        Tanque three = new Tanque(25, 10, 3);

        one.mostrarDados();
        one.sofreDano();
        System.out.println(one.getHp());

    }
}