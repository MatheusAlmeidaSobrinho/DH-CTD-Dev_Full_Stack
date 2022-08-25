package com.example.aula_22_.model;

public class Veiculo {

    private String cor;
    private String marca;

    public Veiculo(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
