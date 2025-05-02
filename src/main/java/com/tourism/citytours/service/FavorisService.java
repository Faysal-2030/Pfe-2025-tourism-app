package com.tourism.citytours.service;

import com.tourism.citytours.model.Favoris;
import com.tourism.citytours.repository.FavorisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService {

    @Autowired
    private FavorisRepository favorisRepository;

    public List<Favoris> getAll() {
        return favorisRepository.findAll();
    }

    public Favoris getById(Long id) {
        return favorisRepository.findById(id).orElse(null);
    }

    public Favoris create(Favoris favoris) {
        return favorisRepository.save(favoris);
    }

    public Favoris update(Long id, Favoris favoris) {
        Favoris existingFavoris = getById(id);
        if (existingFavoris != null) {
            favoris.setId(id);
            return favorisRepository.save(favoris);
        }
        return null;
    }

    public void delete(Long id) {
        favorisRepository.deleteById(id);
    }
}
