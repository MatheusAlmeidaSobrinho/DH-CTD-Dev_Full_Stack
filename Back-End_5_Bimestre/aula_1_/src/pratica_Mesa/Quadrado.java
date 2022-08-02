package pratica_Mesa;

public class Quadrado extends Figura{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4*lado;
    }
}
