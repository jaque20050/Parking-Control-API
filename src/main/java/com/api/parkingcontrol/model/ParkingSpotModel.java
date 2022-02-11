package com.api.parkingcontrol.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id; // identificadores distribuidos, universais

	@Column(nullable = false, unique = true, length = 10)
	// Não pode ser vazio, e será unico com limitação de caracteres
	private String parkingSpotNumber; // numero da vaga

	@Column(nullable = false, unique = true, length = 7)
	private String licensePlateCar; // placa do carro

	@Column(nullable = false, length = 70)
	private String brandCar; // marca do carro

	@Column(nullable = false, length = 70)
	private String modelCar; // modelo do carro

	@Column(nullable = false, length = 70)
	private String colorCar; // cor do carro

	@Column(nullable = false)
	private LocalDateTime registrationDate; // Data de registro

	@Column(nullable = false, length = 130)
	private String responsibleName; // nome do responsável

	@Column(nullable = false, length = 30)
	private String apartment; // apartamento

	@Column(nullable = false, length = 30)
	private String block; // bloco
	
	
}
