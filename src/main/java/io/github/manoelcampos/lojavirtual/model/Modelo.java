package io.github.manoelcampos.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Modelo extends AbstractEntity {
    private String descricao;

    @ManyToOne
    private Marca marca;
}
