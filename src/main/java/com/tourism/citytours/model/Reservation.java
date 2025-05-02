package com.tourism.citytours.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateReservation;

    @ManyToOne
    private Visiteur visiteur;

    @ManyToOne
    private Chambre chambre;
    
    public void setId(Long id) {
        this.id = id;
    }
}
