package com.jhoncout.ClinicaOdonto.persistance.repository;

import com.jhoncout.ClinicaOdonto.persistance.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {

}
