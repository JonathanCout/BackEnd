package com.jhoncout.Aula29.repository;

import com.jhoncout.Aula29.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
