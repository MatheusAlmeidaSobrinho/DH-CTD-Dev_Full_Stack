package com.matheus;

import com.matheus.models.Leao;
import com.matheus.models.Tigre;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //Outra forma de configurar sem criar o arquivo log4j.properties - Descomente a linha abaixo:
        // BasicConfigurator.configure();
        Leao leao = new Leao();
        leao.setIdade(4);
        leao.setNome("Simba");
        leao.setAlfa(true);
        leao.correr();

        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do le�o " + leao.getNome() + " est� incorreta", e);
        }

        Leao leao2 = new Leao();
        leao2.setNome("Scar");
        leao2.setAlfa(false);
        leao2.setIdade(-1);

        leao2.correr();
        try {
            leao2.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do le�o " + leao2.getNome() + " est� incorreta", e);
        }

        Tigre tigre = new Tigre();
        tigre.setNome("Tiger");
        tigre.setIdade(8);
        tigre.correr();
        try {
            tigre.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do tigre " + tigre.getNome() + " est� incorreta", e);
        }

        Tigre tigre2 = new Tigre();
        tigre2.setNome("Scot");
        tigre.setIdade(-2);
        try {
            tigre2.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do tigre " + tigre2.getNome() + " est� incorreta", e);
        }
        tigre2.correr();
    }
}
