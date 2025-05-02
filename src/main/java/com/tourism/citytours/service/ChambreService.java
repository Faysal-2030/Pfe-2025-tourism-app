package com.tourism.citytours.service;

import com.tourism.citytours.model.Chambre;
import com.tourism.citytours.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    public List<Chambre> getAll() {
        return chambreRepository.findAll();
    }

    public Chambre getById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    public Chambre create(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public Chambre update(Long id, Chambre chambre) {
        Chambre existingChambre = getById(id);
        if (existingChambre != null) {
            chambre.setId(id);
            return chambreRepository.save(chambre);
        }
        return null;
    }

    public void delete(Long id) {
        chambreRepository.deleteById(id);
    }
}
