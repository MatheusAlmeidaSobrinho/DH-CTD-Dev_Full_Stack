package model;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private String nome;
    private String sobrenome;
    private String cpfOurg;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cpfOurg, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpfOurg = cpfOurg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpfOurg() {
        return cpfOurg;
    }

    public void setCpfOurg(String cpfOurg) {
        this.cpfOurg = cpfOurg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "Nome: " + nome +
                ", sobrenome: " + sobrenome +
                ", documento: " + cpfOurg +
                ", salario: " + salario +
                "]";
    }
}
