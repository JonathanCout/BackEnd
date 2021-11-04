package com.digitalhouse.aula06WT.interfaces.impl;

import com.digitalhouse.aula06WT.interfaces.ISerie;

public class GradeSerie implements ISerie {

    @Override
    public String getSerie(String nome) {
        return String.format("www.%s.com", nome);
    }
}
