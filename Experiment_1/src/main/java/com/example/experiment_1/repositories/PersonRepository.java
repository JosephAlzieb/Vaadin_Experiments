package com.example.experiment_1.repositories;

import com.example.experiment_1.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, Long> {

}
