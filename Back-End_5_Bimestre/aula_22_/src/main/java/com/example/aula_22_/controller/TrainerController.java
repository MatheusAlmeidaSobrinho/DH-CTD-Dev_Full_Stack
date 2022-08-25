package com.example.aula_22_.controller;

import com.example.aula_22_.model.Trainer;
import com.example.aula_22_.service.impl.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer") // é aquele extra q fica dps do localhost:8080
public class TrainerController {

    @Autowired // substitui aquelas intanciações uma dentro da outra
    private TrainerServiceImpl trainerService;

    @GetMapping
    public List<Trainer> getTrainer() {
        return trainerService.listTrainer();
    }
}
