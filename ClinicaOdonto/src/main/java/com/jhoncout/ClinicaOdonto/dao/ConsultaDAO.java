package com.jhoncout.ClinicaOdonto.dao;

import java.time.LocalDate;

public class ConsultaDAO {

    private Integer dentistaId;
    private Integer pacienteId;
    private LocalDate dataConsulta;

    public Integer getDentistaId() {
        return dentistaId;
    }

    public void setDentistaId(Integer dentistaId) {
        this.dentistaId = dentistaId;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
