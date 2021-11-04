package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.interfaces.ISerie;
import com.digitalhouse.aula06WT.interfaces.impl.GradeSerie;
import com.digitalhouse.aula06WT.interfaces.impl.SerieProxy;
import com.digitalhouse.aula06WT.model.Serie;

public class Main {

    public static void main(String[] args){
        Serie serie1 = new Serie("Punisher");
        ISerie serieProxy = new SerieProxy(new GradeSerie(), 0);

        try {
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
            System.out.println(serieProxy.getSerie(serie1.getNome()));
        }catch (SerieProxy.SerieNaoHabilitadaException e) {
            System.out.println(e.getMessage());
        }
    }
}
