package service;

import dao.ConfiguracaoJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {
    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFilial() {
        Filial filial = new Filial("Beiramar","Rua Hortela",001,"Cedral","Sao Paulo",true);
        filialService.salvar(filial);

        Filial filial2 = new Filial("StarPlus","Rua Abacaxi",101,"Potirendaba","Sao Paulo",true);
        filialService.salvar(filial2);

        Filial filial3 = new Filial("Potato Hotel","Rua Potato Fries",202,"Itaiu","Amazonas",false);
        filialService.salvar(filial3);

        Filial filial4 = new Filial("Plus Ultra","Avenida Guimaraes",303,"Rio Preto","Sao Paulo",false);
        filialService.salvar(filial4);

        Filial filial5 = new Filial("Hotels Palace","Avenida Bela",404,"Grajau","Rio de Janeiro",false);
        Filial resultado = filialService.salvar(filial5);


        assertTrue(filial.getId() == 1);

        assertFalse(filial3.iseCincoEstrelas());

        String nomeFilial = filial.getNome();

        assertEquals(nomeFilial, "Beiramar");

        assertEquals(filial5.getNome(), resultado.getNome());

    }
    
}