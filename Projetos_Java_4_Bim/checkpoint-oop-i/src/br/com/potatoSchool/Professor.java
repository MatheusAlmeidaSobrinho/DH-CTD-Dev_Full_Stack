package br.com.potatoSchool;

public class Professor extends Funcionario {
    private int senha;

    public Professor(String nome, String cpf, int registro, String email, double salario, int dias, int senha) {
        super(nome, cpf, registro, email, salario, dias);
        this.senha = senha;
    }

    public void editarPortal(String cpf, int senha){
        if(autenticaSenha(cpf, senha)){
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado, sua senha está incorreta!");
        }
    }

    public boolean autenticaSenha(String cpf, int senha){
        if(super.getCpf() == cpf && this.senha == senha){
            return true;
        }
        return false;
    }

    @Override
    public double bonificacao() {
        return super.bonificacao() + 200;
    }
}
