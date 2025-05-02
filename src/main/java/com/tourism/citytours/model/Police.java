package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "polices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Police {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String telephone;
    
    public void setId(Long id) {
        this.id = id;
    }
}
