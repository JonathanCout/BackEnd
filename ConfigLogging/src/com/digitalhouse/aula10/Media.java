package com.digitalhouse.aula10;

import java.util.ArrayList;
import java.util.List;

public class Media {

    private List<Integer> listaNumeros = new ArrayList<>();
    private Double media;

    public Media(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String calcularMedia(){
        this.media = (double) listaNumeros.stream().reduce(0, Integer::sum) / this.listaNumeros.size();
        return String.format("A média da lista é: %s",this.getMedia());
//        Double sum = 0.0;
//        for(Integer numero: this.listaNumeros){
//            sum += numero;
//        }
//        this.media = sum/listaNumeros.size();
    }
}
