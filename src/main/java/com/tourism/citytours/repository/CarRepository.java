package com.tourism.citytours.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.abisoft.persistence.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	    // Méthodes personnalisées (si besoin)
	    List<Car> findByMarque(String marque);
	}
