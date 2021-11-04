package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore getArvore(Integer altura, Integer largura, String cor) {
        String id = String.format("altura:%s largura:%s cor:%s",altura,largura,cor);

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Arvore(altura, largura, cor));
            System.out.println("Árvore criada!");
        }
        return flyweight.get(id);
    }
}
