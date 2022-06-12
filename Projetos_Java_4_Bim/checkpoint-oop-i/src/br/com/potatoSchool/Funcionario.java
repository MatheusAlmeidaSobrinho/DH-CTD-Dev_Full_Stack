package br.com.potatoSchool;

public class Funcionario extends Pessoa{
    private double salario;
    private Beneficio beneficio;
    private int diasTrabalhados;


    public Funcionario(String nome, String cpf, int registro, String email, double salario, int dias) {
        super(nome, cpf, registro, email);
        this.salario = salario;
        this.diasTrabalhados = dias;
        this.beneficio = new Beneficio();
        this.beneficio.calculaTransporte(this.getDiasTrabalhados());
    }

    public double desconto(){
        return this.salario * 0.025;
    }

    public double bonificacao(){
        return this.salario * 0.075;
    }

    public double salarioLiquido(){
        return this.salario  += this.bonificacao() - this.desconto();
    }

    public double setSalario(double salario) {
        return this.salario = salario;
    }

    public double getSalario() {
        return this.salario ;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void getBeneficio() {
        System.out.println("Vale Alimentação: " + beneficio.getValeAlimentacao());
        System.out.println("Vale Transporte: " + beneficio.getValeTransporte());
    }


}
