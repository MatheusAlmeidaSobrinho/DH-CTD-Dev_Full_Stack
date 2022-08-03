package creditos.src.com.dh.banco.service.impl;

import creditos.src.com.dh.banco.service.FuncionarioBanco;

public class Diretor extends FuncionarioBanco {
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia > 200000)
            System.out.println("Eu estou encarregado de administrar isso. Diretor");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarSolicitacao(quantia);
    }
}
