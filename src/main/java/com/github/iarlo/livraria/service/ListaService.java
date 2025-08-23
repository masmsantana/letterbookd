package com.github.iarlo.livraria.service;

import com.github.iarlo.livraria.model.Lista;
import com.github.iarlo.livraria.model.Livro;
import com.github.iarlo.livraria.repository.ListaRepository;

public class ListaService {

    private static ListaService instanciaUnica;
    private final ListaRepository listaRepository;

    private ListaService(){
        this.listaRepository = ListaRepository.getInstance();
    }

    public static ListaService getInstance(){
        if (instanciaUnica == null){
            instanciaUnica = new ListaService();
        }
        return instanciaUnica;
    }

    public void adicionarLivroLido(Livro livro) {
        listaRepository.adicionarLivroLido(livro);
    }

    public void adicionarLivroNaLista(Livro livro) {
        listaRepository.adicionarLivroNaLista(livro);
    }

    public void removeLivroLido(Livro livro) {
        listaRepository.removeLivroLido(livro);
    }

    public void removeLivroLista(Livro livro) {
        listaRepository.removeLivroLista(livro);
    }

    public Lista obterLista() {
        return listaRepository.getLista();
    }
}
