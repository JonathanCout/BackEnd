package com.jhoncout.Aula33.service;

import com.jhoncout.Aula33.dao.PartidaDAO;
import com.jhoncout.Aula33.enums.Status;
import com.jhoncout.Aula33.model.Partida;
import com.jhoncout.Aula33.model.Time;
import com.jhoncout.Aula33.repository.PartidaRepository;
import com.jhoncout.Aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepo;

    @Autowired
    private TimeRepository timeRepo;

    public Partida createPartida(PartidaDAO dao){
        Partida partida = new Partida();
        Optional<Time> timeLocal = timeRepo.findById(dao.getIdTimeLocal());
        Optional<Time> timeVisitante = timeRepo.findById(dao.getIdTimeVisitante());

        partida.setStatus(Status.valueOf(dao.getStatus()));
        partida.setResultado(dao.getResultado());
        partida.setTimeLocal(timeLocal.get());
        partida.setTimeVisitante(timeVisitante.get());

        return partidaRepo.save(partida);
    }
}
