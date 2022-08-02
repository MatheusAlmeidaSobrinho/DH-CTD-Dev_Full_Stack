package pratica_Mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    Figura quadrado1 = new Quadrado(2.5);
    Figura circulo1 = new Circulo(3);

    @Test
    void calculaPerimetroTest() {
        double calcQuadrado1 = quadrado1.calculaPerimetro();
        assertEquals(10,calcQuadrado1);

        double calcCirculo1 = circulo1.calculaPerimetro();
        assertEquals(18.84,calcCirculo1);
    }
}