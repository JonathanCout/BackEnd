package com.jhoncout.Aula33.repository;

import com.jhoncout.Aula33.model.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, String> {
}
