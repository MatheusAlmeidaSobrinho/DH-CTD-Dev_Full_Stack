package com.example.aula_23_.model;

public class Dentista {

    private Integer id;
    private String nome;
    private String email;
    private Integer numMatricula;
    private Boolean atendeConvenio;

    public Dentista(Integer id, String nome, String email, Integer numMatricula, Boolean atendeConvenio) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Boolean getAtendeConvenio() {
        return atendeConvenio;
    }

    public void setAtendeConvenio(Boolean atendeConvenio) {
        this.atendeConvenio = atendeConvenio;
    }
}
