package exercicioGuiado;

public class Main {
    public static void main(String[] args) {
        ComputadorFactory computadorFactory = new ComputadorFactory();
        Computador mac1 = computadorFactory.getComputador(8,500);
        Computador mac2 = computadorFactory.getComputador(8,500);
        Computador win1 = computadorFactory.getComputador(16,128);
        Computador win2 = computadorFactory.getComputador(16,128);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(win1.toString());
        System.out.println(win2.toString());
    }
}