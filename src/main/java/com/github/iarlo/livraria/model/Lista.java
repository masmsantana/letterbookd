package com.github.iarlo.livraria.model;

import java.util.ArrayList;
import java.util.List;

public class Lista extends BaseModel {
  private List<Livro> livrosLidos = new ArrayList<>();
  private List<Livro> livrosLista = new ArrayList<>();

  public List<Livro> getLivrosLidos() {
    return livrosLidos;
  }

  public List<Livro> getLivrosLista() {
    return livrosLista;
  }

  public void addLivroLido(Livro livro) {
    livrosLidos.add(livro);
  }

  public void addLivroLista(Livro livro) {
    livrosLista.add(livro);
  }

  public void removeLivroLido(Livro livro) {
    livrosLidos.remove(livro);
  }

  public void removeLivroLista(Livro livro) {
    livrosLista.remove(livro);
  }
}
