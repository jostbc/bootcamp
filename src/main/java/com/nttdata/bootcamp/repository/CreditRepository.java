package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.model.Credit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditRepository extends MongoRepository<Credit, String> {
    @Query("{'id':?0}")
    public List<Credit> findByCreditId(String id);
}
