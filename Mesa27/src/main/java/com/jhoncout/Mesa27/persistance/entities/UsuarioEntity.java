package com.jhoncout.Mesa27.persistance.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TABELA_USUARIOS")
@Getter @Setter
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String username;

    @Column (name = "pass")
    private String password;
}
