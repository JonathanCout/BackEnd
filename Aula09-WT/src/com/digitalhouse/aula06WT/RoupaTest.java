package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.Roupa;
import com.digitalhouse.aula06WT.model.Tamanho;
import com.digitalhouse.aula06WT.model.Tipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaTest {

    Roupa calca;
    Roupa camisa;
    RoupaFactory factory;
    List<Roupa> cart;

    @BeforeEach
    void doBefore() {
        factory = new RoupaFactory();
        cart = new ArrayList<>();
        calca = factory.getRoupa(Tamanho.M, Tipo.CALCA, true, false);
        camisa = factory.getRoupa(Tamanho.S,Tipo.CAMISA,true,true);
    }

    @Test
    void getCalca(){
        assertEquals(new Roupa(Tamanho.M,Tipo.CALCA,true,false).toString(),calca.toString());
    }

    @Test
    void getFactory(){

        cart.add(calca);
        cart.add(calca);
        cart.add(calca);
        cart.add(calca);
        cart.add(calca);
        cart.add(camisa);
        cart.add(camisa);

        assertEquals(2,factory.getContador());

    }
}
