package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentaire;
    private int note;

    // Ajouter ce setter :
    public void setId(Long id) {
        this.id = id;
    }
}
