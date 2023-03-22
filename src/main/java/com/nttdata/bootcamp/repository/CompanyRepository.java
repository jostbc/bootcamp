package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
    @Query("{'id':?0}")
    public List<Company> findByCompanyId(String id);
}
