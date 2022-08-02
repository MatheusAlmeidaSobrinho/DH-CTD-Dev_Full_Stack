package com.dh.pagos.service.impl;

import com.dh.pagos.model.Cartao;
import com.dh.pagos.model.CartaoCredito;
import com.dh.pagos.service.PagamentoService;

public class ProcessadorCredito extends PagamentoService {
    @Override
    protected Boolean autorizarPgto(Cartao cartao, Double quantia) {
        CartaoCredito cartaoPorAutorizar = ((CartaoCredito) cartao);
        Double saldoDisponivel = cartaoPorAutorizar.getLimite()-cartaoPorAutorizar.getSaldoUtilizado();

        return (saldoDisponivel >= quantia);
    }
}
