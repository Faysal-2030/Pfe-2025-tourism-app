package com.tourism.citytours.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.abisoft.annotations.RequiredArgsConstructor;
import ma.abisoft.persistence.model.Car;
import ma.abisoft.repository.CarRepository;

@Service
@RequiredArgsConstructor
public class CarService {
	
	    private final CarRepository carRepository = null;

	    public List<Car> getAllCars() {
	        return carRepository.findAll();
	    }

	    public Car getCarById(Long id) {
	        return carRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Voiture non trouvée"));
	    }
	
}
