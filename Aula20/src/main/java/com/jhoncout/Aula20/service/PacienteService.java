package com.jhoncout.Aula20.service;


import com.jhoncout.Aula20.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class PacienteService {

    private static Map<Integer, Paciente> flyweight = new HashMap<>();

    private String[] nomesVec = {"Lucas","Jonathan","Matheus","Vinicius","Adryanna","Felipe","Matheus","Xablau","Relâmapago","Chapolim"};

    private String[] sobrenomeVec = {"Paglia","Coutinho","Affonso","Mendes","Portugal","Rosa","Andrade","Tikarikatica","Marquinhos","Colorado"};

    public Map<Integer, Paciente> buscarPacientes(){
        return flyweight;
    }

    public Paciente criarPaciente(){
        Random random = new Random();
        String nome = nomesVec[random.nextInt(nomesVec.length)];
        String sobrenome = sobrenomeVec[random.nextInt(sobrenomeVec.length)];
        String email = (nome+sobrenome+"@gmail.com").toLowerCase();
        Integer id = flyweight.size() + 1;
        flyweight.put(id,new Paciente(nome,sobrenome,email, random.nextInt(18, 45)));
        return flyweight.get(id);
    }

    public void deletarPaciente(Integer id){
        flyweight.remove(id);
    }

}
