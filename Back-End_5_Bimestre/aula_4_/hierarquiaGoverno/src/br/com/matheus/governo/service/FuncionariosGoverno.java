package br.com.matheus.governo.service;

public abstract class FuncionariosGoverno {

    protected FuncionariosGoverno proximoFuncionario;

    public abstract void processarDocumento(String documento, Integer nivelAcesso);

    public FuncionariosGoverno setProximoFuncionario(FuncionariosGoverno proximoFuncionario) {
        this.proximoFuncionario = proximoFuncionario;
        return this;
    }
}
