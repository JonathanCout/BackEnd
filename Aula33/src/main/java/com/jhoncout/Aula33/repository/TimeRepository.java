package com.jhoncout.Aula33.repository;

import com.jhoncout.Aula33.model.Time;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends MongoRepository<Time,String> {
}
