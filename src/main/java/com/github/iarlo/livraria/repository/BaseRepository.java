package com.github.iarlo.livraria.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseRepository<T> {

    protected Map<Integer, T> dados = new HashMap<>();

    public List<T> buscarTodos() {
        return List.copyOf(dados.values());
    }

    public T buscarPorId(int id) {
        return dados.get(id);
    }

    public void editar(int id, T objeto) {
        dados.put(id, objeto);
    }

    public void excluir(int id) {
        dados.remove(id);
    }
}
