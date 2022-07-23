package br.com.malura.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class _5_TestaPerformance {
    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<Integer>(); tempo gasto: 1085ms
        Collection<Integer> numeros = new HashSet<Integer>(); // tempo gasto: 14ms

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }
}
