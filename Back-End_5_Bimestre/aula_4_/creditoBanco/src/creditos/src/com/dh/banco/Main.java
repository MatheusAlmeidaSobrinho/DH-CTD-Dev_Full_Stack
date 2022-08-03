package creditos.src.com.dh.banco;

import creditos.src.com.dh.banco.service.FuncionarioBanco;
import creditos.src.com.dh.banco.service.impl.Diretor;
import creditos.src.com.dh.banco.service.impl.ExecutivoDeConta;
import creditos.src.com.dh.banco.service.impl.Gerente;

public class Main {

    public static void main(String[] args) {

        FuncionarioBanco handlerBase = new ExecutivoDeConta()
                .setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));

        handlerBase.processarSolicitacao(78000);

    }
}
