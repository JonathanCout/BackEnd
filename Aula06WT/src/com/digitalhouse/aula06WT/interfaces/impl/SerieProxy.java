package com.digitalhouse.aula06WT.interfaces.impl;

import com.digitalhouse.aula06WT.interfaces.ISerie;

public class SerieProxy implements ISerie {

    private GradeSerie gradeSerie;
    private int qntdViews;

    public SerieProxy(GradeSerie gradeSerie, int qntdViews) {
        this.gradeSerie = gradeSerie;
        this.qntdViews = qntdViews;
    }

    public int getQntdViews() {
        return qntdViews;
    }

    public void setQntdViews(int qntdViews) {
        this.qntdViews = qntdViews;
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException{
        if(this.getQntdViews() > 4) {
            throw new SerieNaoHabilitadaException("Você atingiu o limite semanal de visualizações");
        }
        this.qntdViews++;
        return String.format("%s. \nVocê já visualizou %s séries essa semana", gradeSerie.getSerie(nome),this.getQntdViews()) ;
    }

    public void reseter() {
        this.setQntdViews(0);
    }

    public class SerieNaoHabilitadaException extends Exception{
        public SerieNaoHabilitadaException(String erro) {
            super(erro);
        }
    }
}
