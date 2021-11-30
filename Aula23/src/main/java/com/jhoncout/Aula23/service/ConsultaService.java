package com.jhoncout.Aula23.service;

import com.jhoncout.Aula23.dao.ConsultaDAO;
import com.jhoncout.Aula23.dao.DentistaDAO;
import com.jhoncout.Aula23.dao.PacienteDAO;
import com.jhoncout.Aula23.model.Consulta;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsultaService {

    private DentistaService dentistaService =new DentistaService();
    private PacienteService pacienteService = new PacienteService();
    private static Map<Integer, Consulta> mapConsulta = new HashMap<>();

    public Map<Integer, Consulta> buscarConsulta() {
        return mapConsulta;
    }
    public void deletarConsulta(Integer id){
        mapConsulta.remove(id);
    }
    public Consulta criarConsulta(ConsultaDAO dao, PacienteDAO pacienteDAO, DentistaDAO dentistaDAO){

        if(!dentistaService.getMapDentista().containsKey(dao.getDentista().getCredencial()) || !pacienteService.getMapPaciente().containsKey(dao.getPaciente().getEmail())){
            return null;
        }
        Integer id = mapConsulta.size()+1;
        mapConsulta.put(id, new Consulta(pacienteService.criarPaciente(pacienteDAO), dentistaService.criarDentista(dentistaDAO), dao.getDataConsulta()));
        return mapConsulta.get(id);
    }
    public Consulta editarConsulta(ConsultaDAO dao){
        Consulta consulta = mapConsulta.get(dao.getId());

        consulta.setDataConsulta(dao.getDataConsulta());

        return consulta;
    }
}
