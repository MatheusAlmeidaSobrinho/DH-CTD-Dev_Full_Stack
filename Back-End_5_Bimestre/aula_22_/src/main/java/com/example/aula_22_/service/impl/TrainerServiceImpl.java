package com.example.aula_22_.service.impl;

import com.example.aula_22_.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService {

    @Override // aqui ele ja faria a consulta no BD, que mandaria pro controller e ele para a view
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"),new Trainer("Ana"));
    }
}
