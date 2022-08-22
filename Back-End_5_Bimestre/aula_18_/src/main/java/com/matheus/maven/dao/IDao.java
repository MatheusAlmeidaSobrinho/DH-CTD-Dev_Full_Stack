package com.matheus.maven.dao;

public interface IDao<T> {

    public T salvar(T t);
}
