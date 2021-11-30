package com.jhoncout.ClinicaOdonto.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Consulta {

    @Id
    @SequenceGenerator(name = "sequencia_consulta",sequenceName = "sequencia_consulta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_consulta")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private Dentista dentista;

    private LocalDate dataConsulta;

    public Consulta(Paciente paciente, Dentista dentista, LocalDate dataConsulta) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataConsulta = dataConsulta;
    }

    public Consulta(){}

    public Integer getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
