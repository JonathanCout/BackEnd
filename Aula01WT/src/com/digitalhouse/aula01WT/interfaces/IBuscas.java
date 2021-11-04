package com.digitalhouse.aula01WT.interfaces;

import java.time.LocalDate;

public interface IBuscas {

    public String buscarLocal(String cidade, LocalDate entrada, LocalDate saida);

}
