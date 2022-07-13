package com.potatoschool;

public abstract class Pessoa { // Classe mãe da herança e abstrata para forçar a implementação dos metodos nas filhas

    private String nome;
    private int registro;
    private String email;

    public Pessoa(String nome, String email, int registro) throws ExcecaoPessoa { // Construtor já realizando uma validação por exception
        String quantidadeCaracteresRegistro = Integer.toString(registro); // convertendo em string
        quantidadeCaracteresRegistro.length(); // realizando a contagem
        if (quantidadeCaracteresRegistro.length() != 5) { // criando uma condição para caso seja diferente da validação, retornar classe MinhaExcecao
            throw new ExcecaoPessoa("Registro deve possuir 5 digitos");
        } else {
            this.nome = nome;
            this.registro = registro;
            this.email = email;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public String getEmail() {
        return email;
    } // Não estamos utilizando para não ficar muito grande e repetitivo a criação dos alunos

    @Override
    public String toString() {
        return super.toString();
    }
}