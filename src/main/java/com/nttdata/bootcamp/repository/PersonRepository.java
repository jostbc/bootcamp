package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    @Query("{'id':?0}")
    public List<Person> findByPersonId(String id);
}
