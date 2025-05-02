package com.tourism.citytours.service;

import com.tourism.citytours.model.Tour;
import com.tourism.citytours.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    public List<Tour> getAll() {
        return tourRepository.findAll();
    }

    public Tour getById(Long id) {
        return tourRepository.findById(id).orElse(null);
    }

    public Tour create(Tour tour) {
        return tourRepository.save(tour);
    }

    public Tour update(Long id, Tour tour) {
        Tour existingTour = getById(id);
        if (existingTour != null) {
            tour.setId(id);
            return tourRepository.save(tour);
        }
        return null;
    }

    public void delete(Long id) {
        tourRepository.deleteById(id);
    }
}
