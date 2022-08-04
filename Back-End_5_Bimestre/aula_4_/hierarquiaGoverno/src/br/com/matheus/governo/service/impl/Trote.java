package br.com.matheus.governo.service.impl;

import br.com.matheus.governo.service.FuncionariosGoverno;

public class Trote extends FuncionariosGoverno {
    @Override
    public void processarDocumento(String documento, Integer nivelAcesso) {
        if (nivelAcesso != 1 || nivelAcesso != 2 || nivelAcesso != 3) {
            System.out.println("Mensagem de acesso nivel: Desconhecido, Mensagem recusada!");
        }
    }
}
