package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.model.CreditCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends MongoRepository<CreditCard, String> {
    @Query("{'id':?0}")
    public List<CreditCard> findByCreditCardId(String id);
}
