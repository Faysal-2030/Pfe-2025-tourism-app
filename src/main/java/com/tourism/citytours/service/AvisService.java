package com.tourism.citytours.service;

import com.tourism.citytours.model.Avis;
import com.tourism.citytours.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public List<Avis> getAll() {
        return avisRepository.findAll();
    }

    public Avis getById(Long id) {
        return avisRepository.findById(id).orElse(null);
    }

    public Avis create(Avis avis) {
        return avisRepository.save(avis);
    }

    public Avis update(Long id, Avis avis) {
        Avis existingAvis = getById(id);
        if (existingAvis != null) {
            avis.setId(id);
            return avisRepository.save(avis);
        }
        return null;
    }

    public void delete(Long id) {
        avisRepository.deleteById(id);
    }
}
