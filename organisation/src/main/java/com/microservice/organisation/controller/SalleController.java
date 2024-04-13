package com.microservice.organisation.controller;

import com.microservice.organisation.entities.Salle;
import com.microservice.organisation.services.Isalleinterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/OrganisationSalle")
public class SalleController {

    @Autowired
    private final Isalleinterface isalleinterface;

    @GetMapping("/get-all-Salles")
    List<Salle> getAllSalles() {
        return isalleinterface.retrieveAllSalles();
    }

    @GetMapping("/get-Salle/{idSalle}")
    Salle getSalle(@PathVariable("idSalle") Integer idSalle) {
        return isalleinterface.retrieveSalle(idSalle);
    }

    @PostMapping("/add-Salle")
    Salle addSalle(@RequestBody Salle Salle) {
        return isalleinterface.addSalle(Salle);
    }

    @PutMapping("/update-Salle")
    Salle updateSalle(@RequestBody Salle Salle) {
        return isalleinterface.updateSalle(Salle);
    }

    @DeleteMapping("/delete-Salle/{idSalle}")
    void deleteSalle(@PathVariable("idSalle") Integer idSalle) {
        isalleinterface.removeSalle(idSalle);
    }
}