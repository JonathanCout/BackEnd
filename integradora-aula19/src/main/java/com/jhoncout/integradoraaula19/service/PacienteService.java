package com.jhoncout.integradoraaula19.service;

import com.jhoncout.integradoraaula19.domain.Dentista;
import com.jhoncout.integradoraaula19.domain.Endereco;
import com.jhoncout.integradoraaula19.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPaciente{

    @Override
    public List<Paciente> listaPacientes() {
        List<Paciente> lista = new ArrayList<>();

        Collections.addAll(lista,
                new Paciente(8169,"Maria","Silva","mariasilva@gmail.com",
                "7894563219",new Date(),new Endereco("Orcadas", "50", "Rio de Janeiro", "RJ"), new Dentista(123,"Carlos","Almeida","AB-123456")),
                new Paciente(1547,"Jose","Silva","josesilva@gmail.com",
                        "1223456794",new Date(),new Endereco("Combu", "221", "Rio de Janeiro", "RJ"),new Dentista(321,"Sabrina","Fernandes","CD-789456")),
                new Paciente(4785,"Jessica","Barros","jessicabarros@gmail.com",
                        "6524897513",new Date(),new Endereco("Paramopama", "100", "Rio de Janeiro", "RJ"),new Dentista(0,"Felipe","Teixeira","ZA-456912")));

        return lista;
    }

    @Override
    public Paciente pacientePorEmail(String email) {
        return new Paciente(1234, "Paciente", "PorEmail", email, "1234567851", new Date(),
                new Endereco("Rio branco", "250", "Rio de Janeiro", "RJ"),new Dentista(0,"Felipe","Teixeira","ZA-456912"));
    }

    @Override
    public List<Dentista> listarDentistas() {

        List<Dentista> lista = new ArrayList<>();

        Collections.addAll(lista,
                new Dentista(123,"Carlos","Almeida","AB-123456"),
                new Dentista(321,"Sabrina","Fernandes","CD-789456"),
                new Dentista(0,"Felipe","Teixeira","ZA-456912"));
        return lista;
    }

    @Override
    public Dentista dentistaPorId(Integer id) {
        return new Dentista(id,"Dentista", "PorId","XX-999999");
    }
}
