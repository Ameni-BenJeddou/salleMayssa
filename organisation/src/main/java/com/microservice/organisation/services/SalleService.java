package com.microservice.organisation.services;

import com.microservice.organisation.entities.Salle;
import com.microservice.organisation.repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalleService implements Isalleinterface {

    @Autowired
    SalleRepository repositorySalle;

    @Override
    public List<Salle> retrieveAllSalles() {
        return repositorySalle.findAll();
    }

    @Override
    public Salle addSalle(Salle salle) {
        return repositorySalle.save(salle);
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return repositorySalle.save(salle);
    }

    @Override
    public Salle retrieveSalle(Integer idSalle) {
        return repositorySalle.findById(idSalle).orElse(null);
    }

    @Override
    public void removeSalle(Integer idSalle) {
        repositorySalle.deleteById(idSalle);

    }
}
