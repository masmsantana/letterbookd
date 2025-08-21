package com.github.iarlo.livraria.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseRepository<T, U> {

    protected Map<U, T> dados = new HashMap<>();

    public List<T> buscarTodos() {
        return List.copyOf(dados.values());
    }
}
