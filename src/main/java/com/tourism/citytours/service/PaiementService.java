package com.tourism.citytours.service;

import com.tourism.citytours.model.Paiement;
import com.tourism.citytours.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    public Paiement getById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    public Paiement create(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public Paiement update(Long id, Paiement paiement) {
        Paiement existingPaiement = getById(id);
        if (existingPaiement != null) {
            paiement.setId(id); // Assurez-vous que Paiement.java a un setId(Long id)
            return paiementRepository.save(paiement);
        }
        return null;
    }

    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}
