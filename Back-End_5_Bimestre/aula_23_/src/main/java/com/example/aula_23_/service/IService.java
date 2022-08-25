package com.example.aula_23_.service;

import java.util.List;

public interface IService <T>{

    T salvar(T t);
    List<T> buscarTodos();
    String excluir(Integer id);
}
