package com.jhoncout.Integradora28.persistance.repository;

import com.jhoncout.Integradora28.persistance.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Integer> {
}
