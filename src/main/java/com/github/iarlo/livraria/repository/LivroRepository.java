package com.github.iarlo.livraria.repository;

import com.github.iarlo.livraria.model.Livro;

/**
 * Implementa o padrão de projeto singleton para garantir que a classe seja
 * criada apenas uma vez. Isso é bom pra gente que vai armazenar dados na
 * memória, pois garante que todos os dados sejam armazenados juntos
 *
 * Referência:
 * https://refactoring.guru/pt-br/design-patterns/singleton/java/example#example-1
 */
public class LivroRepository extends BaseRepository<Livro> {

    private static LivroRepository instancia;

    /**
     * Se a instancia já tiver sido definida, retorna ela, se não, cria uma nova
     */
    public static LivroRepository pegarInstancia() {
        if (instancia == null) {
            instancia = new LivroRepository();
        }
        return instancia;
    }

    /**
     * O constructor privado serve pra impedir que a classe seja acessada
     * diretamente
     */
    private LivroRepository() {
    }
}
