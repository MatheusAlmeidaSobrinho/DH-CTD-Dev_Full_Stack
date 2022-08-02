package com.dh.pagos.service;

import com.dh.pagos.model.Cartao;

import java.util.Date;

public abstract class PagamentoService {

    public Boolean processarPgto(Cartao cartao, Double quantia) {
        Boolean pgtoRealizado = Boolean.FALSE;
        System.out.println("Tentando processar o pagamento...");

        if (cartao.getDataExpiracao().after(new Date())) {
            Boolean pgtoAutorizado = autorizarPgto(cartao, quantia);
            if (pgtoAutorizado) {
                System.out.println("Realizando o pagamento autorizado...");
                pgtoRealizado = Boolean.TRUE;
            }

        }

        return pgtoRealizado;


    }

    protected abstract Boolean autorizarPgto(Cartao cartao, Double quantia);
}
