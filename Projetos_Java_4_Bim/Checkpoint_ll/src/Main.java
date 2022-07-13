import com.potatoschool.ExcecaoPessoa; // Import da Classe MinhaExcecao
import com.potatoschool.PotatoSchool; // Import da Classe PotatoSchool
import com.potatoschool.Professor; // Import da Classe Professor

import java.util.*; // Utilizando a classe java.util e colocando * para facilitar os diversos import's dessa classe


public class Main {
    public static void main(String[] args) {
        PotatoSchool potatoSchool = new PotatoSchool();
        List<Professor> listaProfessor = potatoSchool.getListaProfessores(); // Criando uma lista de Professores
        Scanner scanner = new Scanner(System.in); // Criando/inicializando o Scanner

        boolean inicializador = true; // Criamos esta variavel para que quando for false ele encerre o loop abaixo
        try { // usando try catch para caso ocorra do retorno ter a exceção InputMismatchException, ela seja representada pelo nosso retorno
            while (inicializador) { // Criando um loop, para interacao do usuario, aonde caso for true ele continua registrando novos prof/aluno
                System.out.println("Digite a opção que vc deseja: \n1- Cadastrar Professor \n2- Cadastrar Aluno \n3- Listar Professores e Alunos\n4- Sair ");

                int opcao = scanner.nextInt(); // Scanner para selecionar uma das opções de cadastro

                switch (opcao) { // inicializando um switch para os casos possiveis
                    case 1: // destinado ao cadastro do professor, nesse caso colocamos na propria classe Aluno
                        potatoSchool.adicionarProfessor();
                        break;
                    case 2: // destinado ao cadastro do aluno
                        potatoSchool.adicionarAluno();

                        break;
                    case 3:
                        potatoSchool.listarProfessoresAlunos();
                        break;
                    case 4: // destinado a encerrar a "tela" de cadastro
                        inicializador = false; // valor false para encerrar o switch
                        break;
                    default: // default para caso digite um numero nao valido ele informe e de a chance de tentar novamente
                        System.err.println("Opção inválida, tente novamente!");
                        break;
                }
            }

            System.out.println("Até logo!! :D");
        } catch (
                InputMismatchException excecao1) { // catch do InputMismatchException para retornos no scanner invalidos
            System.err.println("Caractere inválido!");
        } catch (ExcecaoPessoa excecaoPessoa) { // catch de retornos invalidos tratados pela classe MinhaExcecao
            System.err.println(excecaoPessoa.getMessage());
        }
    }

}