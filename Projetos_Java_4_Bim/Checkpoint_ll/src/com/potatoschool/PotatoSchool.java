package com.potatoschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PotatoSchool { // Classe que representa nossa "Escola" que possui professores
    private List<Professor> listaProfessores = new ArrayList<Professor>(); // Atributo da lista de professores
    Scanner scanner = new Scanner(System.in);

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    } // Metodo que permite pegar a lista de professores


    public void adicionarProfessor() throws ExcecaoPessoa {
        System.out.println("Cadastro Professor:\nNome: ");
        String nomeProfessor = scanner.next();
        System.out.println("Email: ");
        String emailProfessor = scanner.next();
        System.out.println("Registro (Deve conter 5 digitos): ");
        int registroProfessor = scanner.nextInt();
        this.listaProfessores.add(new Professor(nomeProfessor, emailProfessor, registroProfessor)); // atribuindo os dados ao novo professor cadastrado
        System.out.println("Professor cadastrado com sucesso! =]");
    }

    public void adicionarAluno() throws ExcecaoPessoa {
        System.out.println("Cadastro Aluno:\nNome: ");
        String nomeAluno = scanner.next();
        System.out.println("Email: ");
        String emailAluno = scanner.next();
        System.out.println("Registro (Deve conter 5 digitos): ");
        int registroAluno = scanner.nextInt();
        if (listaProfessores.size() == 0) {
            throw new ExcecaoPessoa("Nenhum professor cadastrado!");
        }
        System.out.println("Selecione o professor responsavel:");
        for (int i = 0; i < listaProfessores.size(); i++) { // realizando um for para mostrar lista de professores atuais
            System.out.println(i + "- " + listaProfessores.get(i).getNome());
        }
        int professorSelecionado = scanner.nextInt();
        System.out.println("Aluno cadastrado e atribuito ao professor com sucesso! =]");
        Aluno aluno = new Aluno(nomeAluno, emailAluno, registroAluno); // estamos agora designando o aluno a um professor
        aluno.cadastrarAluno(listaProfessores.get(professorSelecionado));
        System.out.println();
    }

    public void removerAluno() throws ExcecaoPessoa {
        System.out.println("Registro (Deve conter 5 digitos): ");
        int registroAluno = scanner.nextInt();
     //   if (registroaluno == registroAluno) {
            // talvez importar lista de alunos pra ca pra realizar essa condição
    }


    public void listarProfessoresAlunos(){
        System.out.println("Lista de professores e seus alunos: \n");
        for (Professor professor : listaProfessores) { // Codigo destinado a mostrar o professor e sua lista de alunos assim  que encerrar switch
            System.out.println(professor);
            for (Aluno aluno : professor.getListaAluno()) {
                System.out.println(aluno);
            }
            System.out.println();
        }
    }

}
