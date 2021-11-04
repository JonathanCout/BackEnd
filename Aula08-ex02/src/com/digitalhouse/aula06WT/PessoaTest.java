package com.digitalhouse.aula06WT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions;
import java.time.LocalDate;



public class PessoaTest {

    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore(){
        pessoa = new Pessoa("Jonathan", "Coutinho");
        pessoa.setIdade(LocalDate.of(1995, 04, 05));
        pessoa1 = new Pessoa("Helena", "Martinez");
        pessoa1.setIdade(LocalDate.of(1990, 11, 12));
        pessoa2 = new Pessoa("Matheus", "Affonso");
        pessoa2.setIdade(LocalDate.of(1990, 11, 12));
    }

    @Test
    void getNomeCompleto(){
        Assertions.assertEquals("Jonathan Coutinho",pessoa.getNomeCompleto());
    }

    @Test
    void testMaioridade(){
        Assertions.assertEquals(true,pessoa.eMaiorDeIdade());
    }
}
