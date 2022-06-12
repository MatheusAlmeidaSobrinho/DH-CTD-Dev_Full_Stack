package br.com.potatoSchool;

public class Main {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Alfa", "123", 123, "diretor1@email.com", 10000.00 , 15);
        Diretor diretor2 = new Diretor("Beta", "456", 456, "diretor2@email.com", 20000.00 , 20);
        Diretor diretor3 = new Diretor("Gama", "789", 789, "diretor3@email.com", 30000.00 , 25);

        Professor professor1 = new Professor("Afonso", "321",321, "prof1@email.com", 1500.00, 10, 123);
        Professor professor2 = new Professor("Beto", "654",654, "prof2@email.com", 2500.00, 20, 123);
        Professor professor3 = new Professor("Carla", "987",987, "prof3@email.com", 3500.00, 30, 123);

        Aluno aluno1 = new Aluno("Deniz", "12345789", 3211, "deniz@email.com", 3,600,123);
        Aluno aluno2 = new Aluno("Fabiana", "12345789", 3211, "fabiana@email.com", 7,600,123);
        Aluno aluno3 = new Aluno("Heloisa", "12345789", 3211, "heloisa@email.com", 10,600,123);


        // Informações sobre salario do Diretor
        System.out.println("Informações Diretor:");
        System.out.println("Salario inicial: " + diretor2.getSalario());
        System.out.println("Bonificação: " + diretor2.bonificacao());
        System.out.println("Desconto: " + diretor2.desconto());
        System.out.println("Salario com desconto e bonificação já inclusos: " + diretor2.salarioLiquido());
        diretor2.getBeneficio();

        System.out.println();

        // Informações sobre salario do Professor
        System.out.println("Informações Professor:");
        System.out.println("Salario inicial: " + professor3.getSalario());
        System.out.println("Bonificação: " + professor3.bonificacao());
        System.out.println("Desconto: " + professor3.desconto());
        System.out.println("Salario com desconto e bonificação já inclusos: " + professor3.salarioLiquido());
        professor3.getBeneficio();

        //Acesso ao portal para edição, professor:
        System.out.println("Editar Portal - Professor");
        professor3.editarPortal("987", 123);
        System.out.println();



        //Informações do Aluno
        System.out.println("Informações Aluno:");
        System.out.println("Acesso Portal - Aluno");
        aluno2.acessarPortal("fabiana@email.com", 13);

        //IAcesso ao portal para estudo, aluno:
        System.out.println("Desconto mensalidade: " + aluno2.descontoMensalidade()); ;
        System.out.println("Mesalidade com desconto aplicado: " + aluno2.getValorMensalidade());

    }
}
