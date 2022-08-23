package clinicaOdontologica.service;

import clinicaOdontologica.dao.IDao;
import clinicaOdontologica.model.Paciente;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente) {
        return pacienteIDao.salvar(paciente);
    }


}
