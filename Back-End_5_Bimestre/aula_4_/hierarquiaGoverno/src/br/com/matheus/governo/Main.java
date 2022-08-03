package br.com.matheus.governo;

import br.com.matheus.governo.service.FuncionariosGoverno;
import br.com.matheus.governo.service.impl.Deputado;
import br.com.matheus.governo.service.impl.Ministro;
import br.com.matheus.governo.service.impl.Presidente;

public class Main {
    public static void main(String[] args) {
        FuncionariosGoverno handlerBase = new Deputado().setProximoFuncionario(new Ministro().setProximoFuncionario(new Presidente()));

        handlerBase.processarDocumento("Ataque terrorista", 2);
        handlerBase.processarDocumento("propresto aleatorio",1);
        handlerBase.processarDocumento("ataque mudial dos zumbis",3);
    }
}
