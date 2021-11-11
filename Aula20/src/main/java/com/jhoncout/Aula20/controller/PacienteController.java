package com.jhoncout.Aula20.controller;


import com.jhoncout.Aula20.domain.Paciente;
import com.jhoncout.Aula20.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping("listar")
    public Map<Integer, Paciente> listarPacientes(){
        return service.buscarPacientes();
    }

    @GetMapping("criar")
    public Paciente criarPaciente(){
        return service.criarPaciente();
    }

    @GetMapping("deletar/{id}")
    public String deletarPaciente(@PathVariable Integer id){
        service.deletarPaciente(id);
        return "Paciente deletado";
    }

}
