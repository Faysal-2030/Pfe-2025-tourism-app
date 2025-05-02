package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String compagnie;
    
    public void setId(Long id) {
        this.id = id;
    }
}
