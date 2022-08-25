package com.example.aula_23_.controller;

import com.example.aula_23_.model.Usuario;
import com.example.aula_23_.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    // http://localhost:8080/usuario/salvarUsuario?id=1&nome=Matheus&email=matheus@email.com&senha=batata&nivelAcesso=Vip
    @GetMapping("/salvarUsuario")
    public Usuario salvarUsuario(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "senha") String senha,
            @RequestParam(value = "nivelAcesso") String nivelAcesso){

        return usuarioService.salvar(new Usuario(id,nome,email,senha,nivelAcesso));
    }

    // http://localhost:8080/usuario/buscarTodosUsuarios
    @GetMapping("/buscarTodosUsuarios")
    public List<Usuario> buscarTodosUsuarios(){
        return usuarioService.buscarTodos();
    }

    // http://localhost:8080/usuario/excluirUsuario/id
    @GetMapping("/excluirUsuario/{id}")
    public String excluirUsuario(@PathVariable Integer id){
        return usuarioService.excluir(id);
    }
}
