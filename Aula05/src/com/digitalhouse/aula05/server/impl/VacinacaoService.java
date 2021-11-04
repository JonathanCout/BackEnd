package com.digitalhouse.aula05.server.impl;

import com.digitalhouse.aula05.model.Pessoa;
import com.digitalhouse.aula05.server.IVacinacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VacinacaoService implements IVacinacao {
    @Override
    public void vacinar(Pessoa pessoa) {

        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        String dataAtualFormatada = formatoData.format(new Date());
        System.out.printf("%s %s portador do RG: %s tomou a vacina %s no dia %s",pessoa.getNome(),pessoa.getSobrenome(),pessoa.getRg(),pessoa.getVacina(),dataAtualFormatada);
    }
}
