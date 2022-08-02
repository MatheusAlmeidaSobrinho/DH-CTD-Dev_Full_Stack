import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestandoTest {
    Cardapios c1 = new CardapioAdulto(100);
    Cardapios c2 = new CardapioInfantil(100);
    Cardapios c3 = new CardapioVegetariano(100);

    @Test
    void ConferirSePrecoFinalEstaCorreto(){

        assertTrue(c1.acrescimo() == 0);
        assertEquals(c2.getPrecoBase() + c2.acrescimo(), 120);
        assertEquals(c3.getPrecoBase() + c3.acrescimo() + 1, 103);

    }

}