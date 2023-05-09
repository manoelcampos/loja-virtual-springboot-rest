package io.github.manoelcampos.lojavirtual.repository;

import io.github.manoelcampos.lojavirtual.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository
        extends JpaRepository<Produto, Long> {
}
