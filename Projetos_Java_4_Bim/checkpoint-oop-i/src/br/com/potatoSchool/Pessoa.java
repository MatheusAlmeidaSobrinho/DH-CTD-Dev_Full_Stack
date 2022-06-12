package br.com.potatoSchool;

public abstract class Pessoa {

    private String nome;

    private String cpf;
    private int registro;
    private String email;

    public Pessoa(String nome, String cpf, int registro, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public String getEmail() {
        return email;
    }


}
