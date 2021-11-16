package com.digitalhouse.aula15;

import com.digitalhouse.aula15.H2.ServidorH2;
import com.digitalhouse.aula15.model.Endereco;
import com.digitalhouse.aula15.model.Estado;
import com.digitalhouse.aula15.model.Paciente;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ServidorH2 servidor = new ServidorH2();
        Endereco endereco = new Endereco("Rua Combu", "269", "apt 304", "Cacuia", "Rio de Janeiro", Estado.RJ);

        Paciente paciente = new Paciente("Jonathan", "Coutinho", "234579516", LocalDate.now(),endereco);

//        O codigo abaixo deve ser rodado somente uma vez, para inserir os dados na tabela Estado, descomente e depois comente-o novamente;
//        for(Estado e: Estado.values()){
//            servidor.insertEstado(e.toString());
//        }
        servidor.insert(endereco);
        servidor.insert(paciente);
        System.out.println(endereco.getId());





    }
}
