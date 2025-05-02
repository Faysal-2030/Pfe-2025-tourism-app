package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transfers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String depart;
    private String arrivee;
    private double prix;

    @ManyToOne
    private Ville ville;
    
    public void setId(Long id) {
        this.id = id;
    }
}
