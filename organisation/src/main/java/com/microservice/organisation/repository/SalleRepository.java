package com.microservice.organisation.repository;

import com.microservice.organisation.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SalleRepository extends JpaRepository<Salle, Integer> {

}