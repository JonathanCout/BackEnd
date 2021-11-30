package com.jhoncout.ClinicaOdonto.service;

import com.jhoncout.ClinicaOdonto.dao.ConsultaDAO;
import com.jhoncout.ClinicaOdonto.persistance.entities.Consulta;
import com.jhoncout.ClinicaOdonto.persistance.entities.Dentista;
import com.jhoncout.ClinicaOdonto.persistance.entities.Paciente;
import com.jhoncout.ClinicaOdonto.persistance.repository.ConsultaRepository;
import com.jhoncout.ClinicaOdonto.persistance.repository.DentistaRepository;
import com.jhoncout.ClinicaOdonto.persistance.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepo;

    @Autowired
    private DentistaRepository dentistaRepo;

    @Autowired
    private PacienteRepository pacienteRepo;

    public Consulta insert(ConsultaDAO dao){
        Paciente paciente = pacienteRepo.getById(dao.getPacienteId());
        Dentista dentista = dentistaRepo.getById(dao.getDentistaId());

        Consulta consulta = new Consulta(paciente,dentista,dao.getDataConsulta());

        return consultaRepo.save(consulta);
    }

    public Consulta update(ConsultaDAO dao, Integer consultaId){
        Consulta consulta = consultaRepo.getById(consultaId);
        consulta.setDentista(dentistaRepo.getById(dao.getDentistaId()));
        consulta.setPaciente(pacienteRepo.getById(dao.getPacienteId()));

        return consultaRepo.save(consulta);
    }

    public List<Consulta> getAllConsultas(){
        return consultaRepo.findAll();
    }

    public Consulta getConsultaById(Integer id){
        return consultaRepo.getById(id);
    }
    public String removeConsulta(Integer id){
        consultaRepo.deleteById(id);
        return "Consulta deletada com sucesso";
    }


}
