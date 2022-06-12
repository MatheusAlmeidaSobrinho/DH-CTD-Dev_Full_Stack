package br.com.potatoSchool;

public class Teste {
    public static void main(String[] args) {
        Diretor lucas = new Diretor("Luqinha", "12345", 12345, "lucas@email.com", 10000.00 , 20);
        Professor matheus = new Professor("Matheus", "123",1233, "matheus@email.com", 2500.00, 30, 1234);
        Aluno tati = new Aluno("Tati", "12345789", 3211, "tati@email.com", 10,600,123);


        // Informações sobre salario Diretor
        System.out.println("Informações Diretor:");
        System.out.println("Salario inicial: " + lucas.getSalario());
        System.out.println("Bonificação: " + lucas.bonificacao());
        System.out.println("Desconto: " + lucas.desconto());
        System.out.println("Salario com desconto e bonificação já inclusos: " + lucas.salarioLiquido());
        lucas.getBeneficio();

        System.out.println();

        // Informações sobre salario Professor
        System.out.println("Informações Professor:");
        System.out.println("Salario inicial: " + matheus.getSalario());
        System.out.println("Bonificação: " + matheus.bonificacao());
        System.out.println("Desconto: " + matheus.desconto());
        System.out.println("Salario com desconto e bonificação já inclusos: " + matheus.salarioLiquido());
        matheus.getBeneficio();

        //Acesso ao portal para edição, professor:
        System.out.println("Editar Portal - Professor");
        matheus.editarPortal("123", 1234);
        System.out.println();




        //Informações
        System.out.println("Informações Aluno:");
        System.out.println("Acesso Portal - Aluno");
        tati.acessarPortal("tati@email.com", 13);


        System.out.println("Desconto mensalidade: " + tati.descontoMensalidade()); ;
        System.out.println("Mesalidade com desconto aplicado: " + tati.getValorMensalidade());


    }
}
