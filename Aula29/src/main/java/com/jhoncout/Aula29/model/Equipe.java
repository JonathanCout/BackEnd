package com.jhoncout.Aula29.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Equipe {

    @Id
    @SequenceGenerator(name = "equipe_sequencia",sequenceName = "equipe_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipe_sequencia")
    private Integer id;

    private String nome;
    private String cidade;

    @OneToMany(mappedBy = "equipe")
    private Set<Jogador> elenco = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Set<Jogador> getElenco() {
        return elenco;
    }

    public void setElenco(Set<Jogador> elenco) {
        this.elenco = elenco;
    }
}
