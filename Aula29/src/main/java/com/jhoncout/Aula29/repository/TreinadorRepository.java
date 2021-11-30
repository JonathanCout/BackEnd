package com.jhoncout.Aula29.repository;

import com.jhoncout.Aula29.model.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinadorRepository extends JpaRepository<Treinador,Integer> {
}
