package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "villes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    private Region region;
}
