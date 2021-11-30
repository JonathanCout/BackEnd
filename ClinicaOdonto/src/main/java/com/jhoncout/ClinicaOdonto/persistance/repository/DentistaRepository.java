package com.jhoncout.ClinicaOdonto.persistance.repository;

import com.jhoncout.ClinicaOdonto.persistance.entities.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista,Integer> {
}
