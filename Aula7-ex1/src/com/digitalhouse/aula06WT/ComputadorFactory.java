package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> flyweight = new HashMap<>();

    public Computador buscarComputador(Integer ram, Integer hd) {
        String id = String.format("ram:%shd:%s", ram,hd);

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Computador(ram, hd));
            System.out.println("Computador criado!");
        }

        return flyweight.get(id);


    }
}
