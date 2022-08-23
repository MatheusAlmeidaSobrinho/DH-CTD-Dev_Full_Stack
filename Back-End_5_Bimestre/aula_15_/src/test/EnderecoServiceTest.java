package test;

import clinicaOdontologica.dao.ConfiguracaoJDBC;
import clinicaOdontologica.dao.impl.EnderecoIDaoImpl;
import clinicaOdontologica.model.Endereco;
import clinicaOdontologica.service.EnderecoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoServiceTest {

    EnderecoService enderecoService = new EnderecoService(new EnderecoIDaoImpl(new ConfiguracaoJDBC()));

    @Test
    void salvar() {
        Endereco enderecoM = new Endereco("Rua das Batatas", 777, "Batatolandia", " Vila Batatopolis");
        Endereco enderecoJ = new Endereco("Rua dos Javinhas", 777, "Javinholandia", " Vila Java");
        enderecoService.salvar(enderecoM);
        enderecoService.salvar(enderecoJ);

        assertNotEquals(enderecoJ.getBairro(),enderecoM.getBairro());
        assertEquals(enderecoJ.getNumero(),enderecoM.getNumero());
    }
}