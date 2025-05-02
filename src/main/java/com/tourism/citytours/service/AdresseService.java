package com.tourism.citytours.service;

import com.tourism.citytours.model.Adresse;
import com.tourism.citytours.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    public List<Adresse> getAll() {
        return adresseRepository.findAll();
    }

    public Adresse getById(Long id) {
        return adresseRepository.findById(id).orElse(null);
    }

    public Adresse create(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    public Adresse update(Long id, Adresse adresse) {
        Adresse existingAdresse = getById(id);
        if (existingAdresse != null) {
            adresse.setId(id);
            return adresseRepository.save(adresse);
        }
        return null;
    }

    public void delete(Long id) {
        adresseRepository.deleteById(id);
    }
}
