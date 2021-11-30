package com.jhoncout.ClinicaOdonto.persistance.repository;

import com.jhoncout.ClinicaOdonto.persistance.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Integer> {
}
