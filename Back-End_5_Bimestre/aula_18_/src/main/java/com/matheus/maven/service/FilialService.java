package com.matheus.maven.service;

import com.matheus.maven.dao.IDao;
import com.matheus.maven.model.Filial;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial) {
        return filialIDao.salvar(filial);
    }

}
