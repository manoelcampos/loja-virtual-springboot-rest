package io.github.manoelcampos.lojavirtual.repository;

import io.github.manoelcampos.lojavirtual.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends ProdutoRepositoryCustom, JpaRepository<Produto, Long> {
    List<Produto> findAllByModeloId(long id);

    @Query("select p from Produto p where p.estoque > 0")
    List<Produto> findAllProdutosEmEstoque();
}
