package br.com.matheus.governo.service.impl;

import br.com.matheus.governo.service.FuncionariosGoverno;
import org.w3c.dom.ls.LSOutput;

public class Deputado extends FuncionariosGoverno {
    @Override
    public void processarDocumento(String documento, Integer nivelAcesso) {
        if (nivelAcesso == 1) {
            System.out.println("Mensagem de acesso nivel: 1 [" + documento + "]");
        } else if (this.proximoFuncionario != null) {
            this.proximoFuncionario.processarDocumento(documento, nivelAcesso);
        }
    }
}
