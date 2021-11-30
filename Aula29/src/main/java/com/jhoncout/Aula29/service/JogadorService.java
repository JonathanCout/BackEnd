package com.jhoncout.Aula29.service;

import com.jhoncout.Aula29.dao.JogadorDAO;
import com.jhoncout.Aula29.model.Equipe;
import com.jhoncout.Aula29.model.Jogador;
import com.jhoncout.Aula29.model.Treinador;
import com.jhoncout.Aula29.repository.EquipeRepository;
import com.jhoncout.Aula29.repository.JogadorRepository;
import com.jhoncout.Aula29.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepo;

    @Autowired
    private TreinadorRepository treinadorRepo;

    @Autowired
    private EquipeRepository equipeRepo;

    public Jogador save(JogadorDAO dao){
        Treinador treinador = treinadorRepo.getById(dao.getTreinadorId());
        Equipe equipe = equipeRepo.getById(dao.getEquipeId());

        Jogador jogador = new Jogador(dao.getNome(), dao.getPosicao(), dao.getNumero(), equipe,treinador);
        return jogadorRepo.save(jogador);

    }
    public List<String> getJogadoresPorTreinador(Integer treinadorId){
        Treinador treinador = treinadorRepo.getById(treinadorId);
        return jogadorRepo.findAllJogadoresPorTreinador(treinador);
    }
}
