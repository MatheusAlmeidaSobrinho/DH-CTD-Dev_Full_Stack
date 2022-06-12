package br.com.potatoSchool;

public class Diretor extends Funcionario{
    public Diretor(String nome, String cpf, int registro, String email, double salario, int dias) {
        super(nome, cpf, registro, email, salario, dias);
    }

    @Override
    public double bonificacao() {
       return super.bonificacao() * 2;
    }

    @Override
    public double desconto() {
        return super.desconto() * 2;
    }


}
