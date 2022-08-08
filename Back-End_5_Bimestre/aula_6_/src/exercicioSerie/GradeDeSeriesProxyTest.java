package exercicioSerie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeDeSeriesProxyTest {
    @Test
    void mostraSerie() {
        Serie s1 = new Serie("Dois Homens e uma Batata","www.dheub.com");
        Serie s2 = new Serie("Comer, Rezar e Batata","www.creb.com");
        Serie s3 = new Serie("Simplismente Batata","www.dheub.com");
        Serie s4 = new Serie("Ideologia da Batata","www.idb.com");

        assertEquals(13,s1.getLink().length());

        assertEquals(24,s1.getNomeSerie().length());

        assertEquals(false,s1.getNomeSerie().contains("Batata")); // pra dar um negativo =]

    }
}