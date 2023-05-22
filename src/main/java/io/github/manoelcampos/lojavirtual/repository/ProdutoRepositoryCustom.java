package io.github.manoelcampos.lojavirtual.repository;

import io.github.manoelcampos.lojavirtual.model.Modelo;

import java.util.Map;

public interface ProdutoRepositoryCustom {
    Map<Modelo, Long> countProdutosByModelo();
}
