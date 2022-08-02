package com.dh.pagos.model;

import java.util.Date;

public class Cartao {

    private String numerosFrente;
    private String codSeguranca;
    private Date dataExpiracao;
    private Tipo tipo;

    public Cartao(String numerosFrente, String codSeguranca, Date dataExpiracao, Tipo tipo) {
        this.numerosFrente = numerosFrente;
        this.codSeguranca = codSeguranca;
        this.dataExpiracao = dataExpiracao;
        this.tipo = tipo;
    }


    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
