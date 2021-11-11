package com.jhoncout.integradoraaula19.service;

import com.jhoncout.integradoraaula19.domain.Dentista;
import com.jhoncout.integradoraaula19.domain.Paciente;

import java.util.List;

public interface IPaciente {

    List<Paciente> listaPacientes();

    Paciente pacientePorEmail (String email);

    List<Dentista> listarDentistas();

    Dentista dentistaPorId(Integer id);
}
