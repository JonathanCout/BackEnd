package com.jhoncout.Aula27.persistance.repository;

import com.jhoncout.Aula27.persistance.entities.MovimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentoRepository extends JpaRepository<MovimentoEntity,Integer> {

}
