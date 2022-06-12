package br.com.potatoSchool;

public class Beneficio {
    private double valeTransporte;
    private double valeAlimentacao ;


    public Beneficio() {
        this.valeAlimentacao = 600;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public double calculaTransporte(int diasTrabalhados){
        return this.valeTransporte = diasTrabalhados * 12;
    }



}
