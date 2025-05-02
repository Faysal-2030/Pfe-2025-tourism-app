package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rue;
    private String codePostal;
    private String pays;

    // Ajouter ce setter :
    public void setId(Long id) {
        this.id = id;
    }
}
