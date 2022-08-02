package com.dh.pagos.service.impl;

import com.dh.pagos.model.Cartao;
import com.dh.pagos.model.CartaoDebito;
import com.dh.pagos.service.PagamentoService;

public class ProcessadorDebito extends PagamentoService {

    @Override
    protected Boolean autorizarPgto(Cartao cartao, Double quantia) {
        CartaoDebito cartaoADebitar = ((CartaoDebito) cartao);
        return (cartaoADebitar.getSaldo() >= quantia);

    }
}
