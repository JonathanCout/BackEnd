package com.jhoncout.Integradora28.persistance.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Produto")
@Getter @Setter
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nome;
    private Integer quantidade;
    private String descricao;
}
