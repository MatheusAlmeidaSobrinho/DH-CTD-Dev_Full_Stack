package pratica_Aula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<Pessoa> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Matri", "Culando", LocalDate.of(2006, 6, 11));
        colecao.add(p1);
        p2 = new Pessoa("Alfa", "Numerico", LocalDate.of(2000, 11, 5));
        colecao.add(p2);
        p3 = new Pessoa("Invy", "Sivil", LocalDate.of(2010, 5, 8));
        colecao.add(p3);
        p4 = new Pessoa("Vinte", "Pegar", LocalDate.of(2014, 9, 16));
        colecao.add(p4);
        p5 = new Pessoa("Setenta", "Fugir", LocalDate.of(2016, 12, 2));
        colecao.add(p5);
        p6 = new Pessoa("Cem", "Conseguir", LocalDate.of(1996, 10, 16));
        colecao.add(p6);
        p7 = new Pessoa("Amy", "Xenia", LocalDate.of(1974, 1, 19));
        colecao.add(p7);
        p8 = new Pessoa("Ronan", "Calnat", LocalDate.of(1999, 2, 20));
        colecao.add(p8);
        p9 = new Pessoa("Ryan", "Florest", LocalDate.of(2005, 3, 27));
        colecao.add(p9);
        p10 = new Pessoa("ItsMy", "Mario", LocalDate.of(2012, 7, 30));
        colecao.add(p10);
    }

    @Test
    void calcularIdadeTest() {
        int idadeMenor = p5.calculaIdade();
        int idadeMenor2 = p4.calculaIdade();
        int idadeMaior = p7.calculaIdade();
        int idadeMaior2 = p6.calculaIdade();

        assertEquals(5, idadeMenor);
        assertEquals(48, idadeMaior);
        assertTrue(idadeMenor2<18);
        assertTrue(idadeMaior2>18);
    }


}