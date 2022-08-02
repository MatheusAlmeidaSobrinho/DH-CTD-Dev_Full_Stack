package com.dh.pagos;

import com.dh.pagos.model.Cartao;
import com.dh.pagos.model.CartaoCredito;
import com.dh.pagos.model.CartaoDebito;
import com.dh.pagos.model.Tipo;
import com.dh.pagos.service.PagamentoService;
import com.dh.pagos.service.impl.ProcessadorCredito;
import com.dh.pagos.service.impl.ProcessadorDebito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Map<String, PagamentoService> processadoresDePgto = Map.of("Credito", new ProcessadorCredito(), "Debito", new ProcessadorDebito());

    @Test
    void pagarCredito() throws ParseException {

        Date dataExpiracao = new SimpleDateFormat("yyyy-MM-dd")
                .parse("2030-06-29");

        Cartao cartaoCredito = new CartaoCredito("1111222233334444",
                "001", dataExpiracao, Tipo.CREDITO, 300000.0,
                60000.0);

        PagamentoService processadorDePgto = processadoresDePgto.get("Credito");

        System.out.println("Pagamento realizado c/ Cartão de Crédito: " +
                processadorDePgto.processarPgto(cartaoCredito, 79000.50));

    }

    @Test
    void pagarDebito() throws ParseException {
        Map<String, PagamentoService> processadoresDePgto = Map.of("Credito", new ProcessadorCredito(), "Debito", new ProcessadorDebito());

        Date dataExpiracaoDeb = new SimpleDateFormat("yyyy-MM-dd")
                .parse("2030-06-29");

        Cartao cartaoDebito = new CartaoDebito("5555666677778888",
                "002", dataExpiracaoDeb, Tipo.DEBITO, 150000.0);

        PagamentoService processadorDePgto = processadoresDePgto.get("Credito");

        processadorDePgto = processadoresDePgto.get("Debito");

        System.out.println("Pagamento realizado c/ Cartão de Débito: " +
                processadorDePgto.processarPgto(cartaoDebito, 500.0));
    }

}