package com.github.iarlo.livraria.repository;

import com.github.iarlo.livraria.model.Lista;

/**
 * Implementa o padrão de projeto singleton para garantir que a classe seja
 * criada apenas uma vez. Isso é bom pra gente que vai armazenar dados na
 * memória, pois garante que todos os dados sejam armazenados juntos
 *
 * Referência:
 * https://refactoring.guru/pt-br/design-patterns/singleton/java/example#example-1
 */
public class ListaRepository extends BaseRepository<Lista> {

  private static ListaRepository instancia;

  /**
   * Se a instancia já tiver sido definida, retorna ela, se não, cria uma nova
   */
  public static ListaRepository pegarInstancia() {
    if (instancia == null) {
      instancia = new ListaRepository();
    }
    return instancia;
  }

  /**
   * O constructor privado serve pra impedir que a classe seja acessada
   * diretamente
   */
  private ListaRepository() {
  }
}
