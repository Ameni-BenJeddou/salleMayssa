package com.microservice.organisation.services;

import com.microservice.organisation.entities.Salle;

import java.util.List;

public interface Isalleinterface {
    List<Salle> retrieveAllSalles();

    Salle addSalle(Salle salle);

    Salle updateSalle(Salle salle);

    Salle retrieveSalle(Integer idSalle);

    void removeSalle(Integer idSalle);

}
