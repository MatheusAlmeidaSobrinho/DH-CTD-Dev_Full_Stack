package pratica_Mesa;

public class Circulo extends  Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return (2*3.14)*raio;
    }
}
