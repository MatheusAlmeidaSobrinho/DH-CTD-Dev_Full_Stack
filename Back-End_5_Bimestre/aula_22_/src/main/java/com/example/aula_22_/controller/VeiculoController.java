package com.example.aula_22_.controller;

import com.example.aula_22_.model.Trainer;
import com.example.aula_22_.model.Veiculo;
import com.example.aula_22_.service.impl.TrainerServiceImpl;
import com.example.aula_22_.service.impl.VeiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/listaveiculos")
public class VeiculoController {

    @Autowired
    private VeiculoServiceImpl veiculoService;

    @GetMapping
    public List<Veiculo> getVeiculo() {
        return veiculoService.listVeiculo();
    }
}
