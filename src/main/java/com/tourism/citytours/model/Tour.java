package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tours")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private LocalDate dateTour;
    private double prix;

    @ManyToOne
    private Ville ville;
    
    public void setId(Long id) {
        this.id = id;
    }
}
