package com.potatoschool;

public class ExcecaoPessoa extends Exception{ // realizando o construtor vazio
    public ExcecaoPessoa(){
        super();
    }

    public ExcecaoPessoa(String mensagem){ // realizando o construtor com retorno de uma mensagem
        super(mensagem);
    }

}
