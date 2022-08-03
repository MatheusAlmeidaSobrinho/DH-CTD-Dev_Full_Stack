package creditos.src.com.dh.banco.service.impl;

import creditos.src.com.dh.banco.service.FuncionarioBanco;

public class ExecutivoDeConta extends FuncionarioBanco {


    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia < 60000)
            System.out.println("Eu estou encarregado de administrar isso. Executivo de Conta");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarSolicitacao(quantia);

    }
}
