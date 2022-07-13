package com.potatoschool;

public abstract class Pessoa { // Classe m�e da heran�a e abstrata para for�ar a implementa��o dos metodos nas filhas

    private String nome;
    private int registro;
    private String email;

    public Pessoa(String nome, String email, int registro) throws ExcecaoPessoa { // Construtor j� realizando uma valida��o por exception
        String quantidadeCaracteresRegistro = Integer.toString(registro); // convertendo em string
        quantidadeCaracteresRegistro.length(); // realizando a contagem
        if (quantidadeCaracteresRegistro.length() != 5) { // criando uma condi��o para caso seja diferente da valida��o, retornar classe MinhaExcecao
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
    } // N�o estamos utilizando para n�o ficar muito grande e repetitivo a cria��o dos alunos

    @Override
    public String toString() {
        return super.toString();
    }
}