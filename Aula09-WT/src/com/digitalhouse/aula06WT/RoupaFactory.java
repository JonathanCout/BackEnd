package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.Roupa;
import com.digitalhouse.aula06WT.model.Tamanho;
import com.digitalhouse.aula06WT.model.Tipo;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {

    private static Map<String,Roupa> flyweight = new HashMap();
    private Integer contador = 0;

    public Roupa getRoupa(Tamanho tamanho, Tipo tipo, boolean nova, boolean importada){

        String id = String.format("tamanho:%stipo:%snova:%simportada:%s", tamanho,tipo,nova,importada);

        if(!flyweight.containsKey(id)){
            flyweight.put(id, new Roupa(tamanho, tipo, nova, importada));
            contador++;
        }
        return flyweight.get(id);
    }

    public Integer getContador() {
        return contador;
    }
}
