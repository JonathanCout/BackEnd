package com.digitalhouse.aula06WT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void retornarZero(){
        Calculadora calc = new Calculadora();
        double soma = calc.sum();
        Assertions.assertEquals(0, soma);
    }

    @Test
    public void retornarSoma(){
        Calculadora calc = new Calculadora();
        double soma = calc.sum(1,2,3,5);
        Assertions.assertEquals(11, soma);
    }
}
