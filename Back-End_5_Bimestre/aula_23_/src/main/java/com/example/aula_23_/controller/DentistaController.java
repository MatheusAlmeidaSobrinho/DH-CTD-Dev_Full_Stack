package com.example.aula_23_.controller;

import com.example.aula_23_.model.Dentista;
import com.example.aula_23_.model.Usuario;
import com.example.aula_23_.service.impl.DentistaServiceImpl;
import com.example.aula_23_.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {
    @Autowired
    private DentistaServiceImpl dentistaService;

    // http://localhost:8080/dentista/salvarDentista?id=1&nome=Javinha&email=javinha@email.com&numMatricula=333&atendeConvenio=true
    @GetMapping("/salvarDentista")
    public Dentista salvarDentista(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "numMatricula") Integer numMatricula,
            @RequestParam(value = "atendeConvenio") Boolean atendeConvenio){

        return dentistaService.salvar(new Dentista(id,nome,email,numMatricula,atendeConvenio));
    }

    // http://localhost:8080/dentista/buscarTodosDentistas
    @GetMapping("/buscarTodosDentistas")
    public List<Dentista> buscarTodosDentistas(){
        return dentistaService.buscarTodos();
    }

    // http://localhost:8080/dentista/excluirDentista/id
    @GetMapping("/excluirDentista/{id}")
    public String excluirDentista(@PathVariable Integer id){
        return dentistaService.excluir(id);
    }
}