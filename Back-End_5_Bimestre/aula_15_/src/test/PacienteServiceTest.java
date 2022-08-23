package test;

import clinicaOdontologica.dao.ConfiguracaoJDBC;
import clinicaOdontologica.dao.impl.EnderecoIDaoImpl;
import clinicaOdontologica.dao.impl.PacienteIDaoImpl;
import clinicaOdontologica.model.Endereco;
import clinicaOdontologica.model.Paciente;
import clinicaOdontologica.service.EnderecoService;
import clinicaOdontologica.service.PacienteService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    PacienteService pacienteService = new PacienteService(new PacienteIDaoImpl(new ConfiguracaoJDBC()));
    EnderecoService enderecoService = new EnderecoService(new EnderecoIDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarPaciente() {

        Endereco enderecoM = new Endereco("Rua das Batatas", 537, "Batatolandia", " Vila Batatopolis");
        Paciente matheus = new Paciente("Matheus", "Almeida", LocalDate.now(), enderecoM);
        pacienteService.salvar(matheus);
        enderecoService.salvar(enderecoM);

        Endereco enderecoJ = new Endereco("Rua dos Javinhas", 377, "Javinholandia", " Vila Java");
        Paciente javinha = new Paciente("Javi", "Nha", LocalDate.now(), enderecoJ);
        pacienteService.salvar(javinha);
        enderecoService.salvar(enderecoJ);

        String nomeJ = javinha.getNome();

        assertNotNull(matheus);
        assertEquals(nomeJ,javinha.getNome());

        //Não sei dizer mais acredito que para excluir deveria vir direto da interface o metodo para isso.
    }
}