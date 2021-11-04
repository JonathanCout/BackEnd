package com.digitalhouse.aula05;

import com.digitalhouse.aula05.model.Pessoa;
import com.digitalhouse.aula05.server.IVacinacao;
import com.digitalhouse.aula05.server.impl.VacinacaoProxy;
import com.digitalhouse.aula05.server.impl.VacinacaoService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("14/10/2021");

        Pessoa pessoa = new Pessoa("Eu", "Tu", "Nós bota nela", "Pfizer", data);

        IVacinacao proxy = new VacinacaoProxy(new VacinacaoService());

        proxy.vacinar(pessoa);

    }
}
