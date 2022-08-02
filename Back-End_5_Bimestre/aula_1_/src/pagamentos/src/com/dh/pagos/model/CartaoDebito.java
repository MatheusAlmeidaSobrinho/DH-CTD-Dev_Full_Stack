package com.dh.pagos.model;

import java.util.Date;

public class CartaoDebito extends Cartao {
    private Double saldo;
    public CartaoDebito(String numerosFrente, String codSeguranca, Date dataExpiracao, Tipo tipo, Double saldo) {
        super(numerosFrente, codSeguranca, dataExpiracao, tipo);
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
