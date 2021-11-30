package com.jhoncout.aula18.service;

import com.jhoncout.aula18.domain.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProfessorServer implements IProfessor{

    @Override
    public List<Professor> listarProfessores() {
        List<Professor> listaProfessores = new ArrayList<>();
        Collections.addAll(listaProfessores,
                new Professor("Roberto",32,"Matematica"),
                new Professor("Julia",28,"História"),
                new Professor("Robson",45,"Fisica"));

        return listaProfessores;
    }
}
