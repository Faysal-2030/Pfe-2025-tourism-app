package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String typeCuisine;

    @ManyToOne
    private Ville ville;
    
    public void setId(Long id) {
        this.id = id;
    }
}
