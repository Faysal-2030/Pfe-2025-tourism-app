package com.tourism.citytours.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.abisoft.annotations.RequiredArgsConstructor;

import ma.abisoft.service.CarService;

@RestController
@RequestMapping("/api/voitures")
@RequiredArgsConstructor
public class PublicCarController {
	 private final CarService carService = new CarService();

	    /*@GetMapping
	   /* public List<CarDTO> getAllCars() {
	        return carService.getAllCars().stream()
	            .map(this::convertToDTO)
	            .collect(Collectors.toList());
	    }

	    @GetMapping("/{id}")
	    public CarDTO getCar(@PathVariable Long id) {
	      //  return convertToDTO(carService.getCarById(id));
	    }

	    /*private CarDTO convertToDTO(Car car) {
	        return  CarDTO.builder())
	            .id(car.getId())
	            .marque(car.getMarque())
	            .modele(car.getModele())
	            .prixJournalier(car.getPrixJournalier())
	            .annee(car.getType())
	            .type(car.getModele())
	            .prixJournalier(car.getPrixJournalier())
	            // ... autres champs
	            .build();
	    }*/
}
