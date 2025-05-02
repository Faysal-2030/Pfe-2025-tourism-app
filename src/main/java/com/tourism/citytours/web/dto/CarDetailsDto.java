package com.tourism.citytours.web.dto;

import groovy.transform.builder.Builder;
import ma.abisoft.annotations.AllArgsConstructor;
import ma.abisoft.annotations.ApiModel;
import ma.abisoft.annotations.ApiModelProperty;
import ma.abisoft.annotations.Data;
import ma.abisoft.annotations.NoArgsConstructor;

public class CarDetailsDto {


	@Data // Génère getters/setters, equals(), hashCode(), toString()
	@Builder // Pattern Builder pour créer des objets facilement
	@NoArgsConstructor // Constructeur sans arguments
	@AllArgsConstructor // Constructeur avec tous les champs
	@ApiModel(description = "Objet de transfert pour les données d'une voiture")
	public class CarDTO {

	    @ApiModelProperty(value = "ID unique de la voiture", example = "1", required = false)
	    private Long id;

	    @ApiModelProperty(value = "Marque du véhicule", required = true, example = "Peugeot")
	    private String marque;

	    @ApiModelProperty(value = "Modèle du véhicule", required = true, example = "308")
	    private String modele;

	    @ApiModelProperty(value = "Année de fabrication", example = "2022", required = false)
	    private Integer annee;

	    @ApiModelProperty(value = "Type de véhicule", example = "SUV", required = false)
	    private String type;

	    @ApiModelProperty(value = "Nombre de places", example = "5", required = false)
	    private Integer places;

	    @ApiModelProperty(value = "Prix de location par jour (€)", required = true, example = "45.99")
	    private Double prixJournalier;

	    @ApiModelProperty(value = "Ville où la voiture est disponible", example = "Paris", required = false)
	    private String ville;

	    @ApiModelProperty(value = "Description détaillée", example = "Voiture familiale en excellent état", required = false)
	    private String description;

	    @ApiModelProperty(value = "Disponibilité actuelle", example = "true", required = false)
	    private Boolean disponible;

		public Object builder() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
