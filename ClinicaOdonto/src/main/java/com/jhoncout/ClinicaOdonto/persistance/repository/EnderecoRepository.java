package com.jhoncout.ClinicaOdonto.persistance.repository;

import com.jhoncout.ClinicaOdonto.persistance.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}
