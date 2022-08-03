package br.com.matheus.governo.service.impl;

import br.com.matheus.governo.service.FuncionariosGoverno;

public class Presidente extends FuncionariosGoverno {
    @Override
    public void processarDocumento(String documento, Integer nivelAcesso) {
        if (nivelAcesso == 3){
            System.out.println("Mensagem de acesso nivel: 3 [" + documento + "]");
        }else if(this.proximoFuncionario != null){
            this.proximoFuncionario.processarDocumento(documento, nivelAcesso);
        }
    }
}
