package com.praxio.desafio.repository;

import com.praxio.desafio.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends JpaRepository<Long, Telephone> {
    
}
