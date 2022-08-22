package clinicaodontologica.service;

import clinicaodontologica.dao.IDao;
import clinicaodontologica.model.Paciente;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente) {
        return pacienteIDao.salvar(paciente);
    }
}