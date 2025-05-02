package com.tourism.citytours.repository;

import com.tourism.citytours.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
