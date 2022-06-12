package br.com.potatoSchool;

public class Aluno extends Pessoa{
    private double notaBolsa;
    private double valorMensalidade;
    private int senha;

    public Aluno(String nome, String cpf, int registro, String email, double notaBolsa, double valorMensalidade, int senha) {
        super(nome, cpf, registro, email);
        this.notaBolsa = notaBolsa;
        this.valorMensalidade = valorMensalidade;
        this.senha = senha;
    }

    public boolean autentica(String email, int senha){
        if(super.getEmail() == email && this.senha == senha){
            return true;
        }
        return false;
    }

    public void acessarPortal(String email, int senha){
        if(autentica(email, senha)){
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Email ou senha incorreto!");
        }
    }

    public double descontoMensalidade(){
        if(this.notaBolsa <= 3){
            return this.valorMensalidade;
        } else if (this.notaBolsa <= 6) {
            double desconto = this.valorMensalidade * 0.25;
            this.valorMensalidade -= desconto;
            return desconto;
        } else if (this.notaBolsa <=9) {
            double desconto = this.valorMensalidade /2;
            this.valorMensalidade -= desconto;
            return desconto;
        } else if (this.notaBolsa == 10) {
            double desconto = this.valorMensalidade * 0.75;
            this.valorMensalidade -= desconto;
            return desconto;
        }
        else {
            return this.valorMensalidade;
        }
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }
}
