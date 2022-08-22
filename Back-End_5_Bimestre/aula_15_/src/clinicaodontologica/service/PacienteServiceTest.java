package clinicaodontologica.service;

import clinicaodontologica.dao.ConfiguracaoJDBC;
import clinicaodontologica.dao.impl.PacienteDaoImpl;
import clinicaodontologica.model.Endereco;
import clinicaodontologica.model.Paciente;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteServiceTest {

    private PacienteService pacienteService = new PacienteService(new PacienteDaoImpl(new ConfiguracaoJDBC()));



    @Test
    public void salvar(){

        Paciente p1 = new Paciente("Matheus","Almeida","44825535-2", LocalDate.now(),new Endereco("Rua Potato",37,"Potatolandia","Vila Potato"));
        pacienteService.salvar(p1);

        Endereco e1 = new Endereco("Rua Mediaval",1,"Frontiers","Vila Media");
        Paciente p2 = new Paciente("Arthur","Pendragon","12345678-0", LocalDate.now(), e1);
        pacienteService.salvar(p2);

        Endereco e2 = new Endereco("Rua Aventure",1,"Reino Doce","Vila Times");
        Paciente p3 = new Paciente("Finn","Mertens ","5af65e16-8", LocalDate.now(), e2);
        Paciente resultado = pacienteService.salvar(p3);


        assertTrue(p1.getId() == 0);

        String nomeFilial = p2.getNome();
        assertEquals(nomeFilial, "Arthur");

        assertEquals(p3.getNome(), resultado.getNome());
    }


}