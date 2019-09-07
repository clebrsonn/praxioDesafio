package com.praxio.desafio.repository;

import com.praxio.desafio.model.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierRepository extends JpaRepository<Long, Carrier> {

}
