package com.example.aula_22_.service.impl;

import com.example.aula_22_.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class VeiculoServiceImpl implements  IVeiculoService{
    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(new Veiculo("Prata","Volks"), new Veiculo("Preto","Ford"), new Veiculo("Branco","Bmw"));
    }
}
