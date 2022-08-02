package com.dh.pagos.model;

import java.util.Date;

public class CartaoCredito extends Cartao {
    private Double limite;
    private Double saldoUtilizado;
    public CartaoCredito(String numerosFrente, String codSeguranca, Date dataExpiracao, Tipo tipo, Double limite, Double saldoUtilizado) {
        super(numerosFrente, codSeguranca, dataExpiracao, tipo);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(Double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
