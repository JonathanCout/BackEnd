package com.digitalhouse.aula10;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");


        List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Media listaMedia = new Media(listaNumeros);

        if(listaNumeros.size() > 10){
            logger.info("A lista tem mais de 10 itens");
        } else if(listaNumeros.size() > 5){
            logger.info("A lista tem mais de 5 itens");
        } else {
            logger.info("A lista tem menos de 5 itens");
        }
        logger.info(String.format("%s", listaMedia.calcularMedia()));

        Integer[] lista = {1,2,3,4};
        Media media2 = new Media(List.of(lista));
        System.out.println(media2.calcularMedia());



    }
}
