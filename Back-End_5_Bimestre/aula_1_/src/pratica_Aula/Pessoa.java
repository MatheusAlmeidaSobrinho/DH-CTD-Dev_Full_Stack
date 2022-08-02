package pratica_Aula;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    List<String> colecao = new ArrayList<String>();

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calculaIdade(){
        return Period.between(this.dataNascimento,LocalDate.now()).getYears();
        //int idade = Period.between(this.dataNascimento,LocalDate.now()).getYears();
        //return idade;
    }

    public List<String> adicionarNomes(Pessoa pessoa){
        int validaNome = pessoa.getNome().length();
        int idade = pessoa.calculaIdade();

        if(validaNome > 4 && idade > 17){
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
        return colecao;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}
