package com.tourism.citytours.persistence.model;

import javax.persistence.*;

import groovy.transform.builder.Builder;
import ma.abisoft.annotations.AllArgsConstructor;
import ma.abisoft.annotations.Getter;
import ma.abisoft.annotations.NoArgsConstructor;
import ma.abisoft.annotations.Setter;

@Entity
@Table(name = "voitures")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String marque; // Ex: "Peugeot"

    @Column(nullable = false, length = 50)
    private String modele; // Ex: "308"

    @Column(name = "annee", nullable = false)
    private Integer annee; // Ex: 2022

    @Column(length = 30)
    private String type; // Ex: "SUV", "Berline"

    @Column(nullable = false)
    private Integer places; // Ex: 5

    @Column(name = "prix_journalier", nullable = false, precision = 10, scale = 2)
    private Double prixJournalier; // Ex: 45.99 (corrigé "prix/lourmalier")

    @Column(length = 100)
    private String ville; // Ex: "Paris"

    @Column(columnDefinition = "TEXT")
    private String description; 

    @Column(nullable = false)
    private Boolean disponible = true; // Par défaut disponible

    // Relation avec le propriétaire
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proprietaire_id")
    private User proprietaire;

    // Méthode utilitaire
    public String getFullName() {
        return marque + " " + modele + " (" + annee + ")";
    }

	public Object getPrixJournalier1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPrixJournalier() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getModele() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMarque() {
		// TODO Auto-generated method stub
		return null;
	}
}