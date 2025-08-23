package com.github.iarlo.livraria.repository;

import com.github.iarlo.livraria.model.Lista;
import com.github.iarlo.livraria.model.Livro;
/**
 * Implementa o padrão de projeto singleton para garantir que a classe seja
 * criada apenas uma vez. Isso é bom pra gente que vai armazenar dados na
 * memória, pois garante que todos os dados sejam armazenados juntos
 *
 * Referência:
 * https://refactoring.guru/pt-br/design-patterns/singleton/java/example#example-1
 */
public class ListaRepository {
    
    private static ListaRepository instancia;
    private final Lista lista = new Lista();
  /**
     * O constructor privado serve pra impedir que a classe seja acessada
     * diretamente
     */
    private ListaRepository(){}
    /**
     * Se a instancia já tiver sido definida, retorna ela, se não, cria uma nova
     */
    public static ListaRepository getInstance(){
        if(instancia == null){
            instancia = new ListaRepository();
        }
        return instancia;
    }

    public void adicionarLivroLido(Livro livro) {
        lista.addLivroLido(livro);
    }

    public void adicionarLivroNaLista(Livro livro) {
        lista.addLivroLista(livro);
    }

    public void removeLivroLido(Livro livro) {
        lista.removeLivroLido(livro);
    }

    public void removeLivroLista(Livro livro) {
        lista.removeLivroLista(livro);
    }

    public Lista getLista() {
        return lista;
    }
}
