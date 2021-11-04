package com.digitalhouse.aula06WT.interfaces;

import com.digitalhouse.aula06WT.interfaces.impl.SerieProxy;

public interface ISerie {

    public String getSerie(String nome) throws SerieProxy.SerieNaoHabilitadaException;
}
