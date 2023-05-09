package io.github.manoelcampos.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Produto extends AbstractEntity {
    private String descricao;
    private double preco;

    @ManyToOne
    private Modelo modelo;

    private int estoque;
}
