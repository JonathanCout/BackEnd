package com.jhoncout.ClinicaOdonto.service;

import com.jhoncout.ClinicaOdonto.dao.PacienteDAO;
import com.jhoncout.ClinicaOdonto.persistance.entities.Endereco;
import com.jhoncout.ClinicaOdonto.persistance.entities.Paciente;
import com.jhoncout.ClinicaOdonto.persistance.repository.EnderecoRepository;
import com.jhoncout.ClinicaOdonto.persistance.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private EnderecoRepository enderecoRepo;

    public Paciente insert(PacienteDAO dao){
        Endereco endereco = enderecoRepo.getById(dao.getEnderecoId());
        Paciente paciente = new Paciente(dao.getNome(), dao.getSobrenome(), dao.getRg(), dao.getEmail(), endereco);
        return pacienteRepo.save(paciente);
    }

    public List<Paciente> getAllPacientes(){
        return pacienteRepo.findAll();
    }

    public Paciente getPacienteById(Integer id){
        return pacienteRepo.getById(id);
    }

    public Paciente updatePaciente(PacienteDAO dao,Integer id){
        Paciente paciente = pacienteRepo.getById(id);
        paciente.setEmail(dao.getEmail());

        return pacienteRepo.save(paciente);
    }

    public Paciente updateEnderecoPaciente(Endereco endereco, Integer id){
        Paciente paciente = pacienteRepo.getById(id);
        paciente.setEndereco(endereco);
        return pacienteRepo.save(paciente);
    }
}
