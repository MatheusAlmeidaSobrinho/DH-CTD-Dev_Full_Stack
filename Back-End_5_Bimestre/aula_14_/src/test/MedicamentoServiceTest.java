package test;

import medicamentos.dao.ConfiguracaoJDBC;
import medicamentos.dao.impl.MedicamentoDaoImpl;
import medicamentos.model.Medicamento;
import medicamentos.service.MedicamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarMedicamento() {
        Medicamento medicamento = new Medicamento("Ibuprofeno", "LabMed", 395, 23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId() != null);
    }

    @Test
    public void salvarMedicamento2() {
        Medicamento medicamento = new Medicamento("dorflex", "MedLab", 593, 3.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId() != null);
    }

}