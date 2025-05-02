package com.tourism.citytours.service;

import com.tourism.citytours.model.Evenement;
import com.tourism.citytours.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {

    @Autowired
    private EvenementRepository evenementRepository;

    public List<Evenement> getAll() {
        return evenementRepository.findAll();
    }

    public Evenement getById(Long id) {
        return evenementRepository.findById(id).orElse(null);
    }

    public Evenement create(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public Evenement update(Long id, Evenement evenement) {
        Evenement existingEvenement = getById(id);
        if (existingEvenement != null) {
            evenement.setId(id);
            return evenementRepository.save(evenement);
        }
        return null;
    }

    public void delete(Long id) {
        evenementRepository.deleteById(id);
    }
}
