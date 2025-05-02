package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "visiteurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visiteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String motDePasse;
}
