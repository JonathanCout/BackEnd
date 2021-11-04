package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.Arvore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArvoreFactory factory = new ArvoreFactory();

        Arvore ornamental = factory.getArvore(200, 400, "verde");
        Arvore frutifera = factory.getArvore(500, 300, "vermelha");
        // Arvore florifera = factory.getArvore(100, 200, "azul");

        List<Arvore> arvoreList = new ArrayList<>();

        for(int i =0; i<=500000; i++){
            arvoreList.add(ornamental);
            arvoreList.add(frutifera);
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
