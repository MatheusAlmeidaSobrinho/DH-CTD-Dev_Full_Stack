package br.com.matheus.governo;

import br.com.matheus.governo.service.FuncionariosGoverno;
import br.com.matheus.governo.service.impl.Deputado;
import br.com.matheus.governo.service.impl.Ministro;
import br.com.matheus.governo.service.impl.Presidente;
import br.com.matheus.governo.service.impl.Trote;

public class Main {
    public static void main(String[] args) {
        FuncionariosGoverno handlerBase = new Deputado().setProximoFuncionario(new Ministro().setProximoFuncionario(new Presidente().setProximoFuncionario(new Trote())));

        handlerBase.processarDocumento("Ataque terrorista", 2);
        handlerBase.processarDocumento("Propresto aleatorio", 1);
        handlerBase.processarDocumento("Ataque mudial dos zumbis", 3);
        handlerBase.processarDocumento("batatinha quando nasce", 4);
    }
}
