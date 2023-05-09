package io.github.manoelcampos.lojavirtual.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Marca extends AbstractEntity {
    private String descricao;
}
