package io.github.manoelcampos.lojavirtual.repository;

import io.github.manoelcampos.lojavirtual.model.Modelo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class ProdutoRepositoryCustomImpl implements ProdutoRepositoryCustom {
    private final EntityManager em;

    public ProdutoRepositoryCustomImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Map<Modelo, Long> countProdutosByModelo() {
        String jpql = "select p.modelo as modelo, count(p) as total from Produto p group by p.modelo";
        return em.createQuery(jpql, Tuple.class)
                 .getResultStream()
                 .collect(
                     toMap(t -> t.get("modelo", Modelo.class),
                     t -> t.get("total", Long.class))
                 );
    }
}
