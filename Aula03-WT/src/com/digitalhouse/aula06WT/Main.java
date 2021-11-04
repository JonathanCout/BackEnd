package com.digitalhouse.aula06WT;

import com.digitalhouse.aula06WT.model.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Funcionario jonathan = new Funcionario("Jonathan", LocalDate.of(2019,10,25));
        Vendedor afiliado1 = new Afiliado("Felipe");
        Vendedor afiliado2 = new Afiliado("Breno");
        Vendedor estagiario1 = new Estagiario("Marcos");

        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.vender();
        jonathan.tornarAfiliado();
        jonathan.calcularAntiguidade();

        System.out.println(jonathan.mostrarCategoria());

        afiliado1.vender();
        afiliado1.vender();
        System.out.println(afiliado1.mostrarCategoria());

        afiliado2.vender();
        afiliado2.vender();
        afiliado2.vender();
        System.out.println(afiliado2.mostrarCategoria());

        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        estagiario1.vender();
        System.out.println(estagiario1.mostrarCategoriaEstagiario());

    }
}
